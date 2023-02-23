package com.example.conversion.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.conversion.common.ConversionUtils;
import com.example.conversion.exception.ConversionException;
import com.example.conversion.model.Request;
import com.example.conversion.model.Response;
import com.example.conversion.validator.ValidateConversionRequest;

@Service
public class ConversionSvc {

	@Autowired
	TempConvertor tempConvertor;
	@Autowired
	private ValidateConversionRequest validator;

	public Response testInput(Request request) throws IllegalAccessException, InvocationTargetException,
			NoSuchMethodException, SecurityException, ClassNotFoundException {

		Response resp = new Response();
		validator.validateRequest(request);

		Class<?> cls = null;
		if (ConversionUtils.getSupportedTemprUnits().contains(request.getInputUnit())) {
			cls = Class.forName("com.example.conversion.service.TempConvertor");
		}
		if (ConversionUtils.getSupportedVolUnits().contains(request.getInputUnit())) {
			cls = Class.forName("com.example.conversion.service.VolumeConvertor");
		}
		StringBuffer methodName = new StringBuffer();
		methodName.append(request.getInputUnit()).append("To").append(request.getTargetUnit());
		Method method = cls.getDeclaredMethod("fahrenheitTorankine", Double.class);
		Double val = (Double) method.invoke(tempConvertor, Double.parseDouble(request.getInputValue()));
		System.out.println("----here------ " + val);
		if (isEqual(val, Double.parseDouble(request.getStudentResponse()))) {
			resp.setResult("Correct");
		} else {
			resp.setResult("InCorrect");
		}

		return resp;
	}

	private boolean isEqual(Double val, Double studentResponse) {
		val = getRoundOff(val);
		studentResponse = getRoundOff(studentResponse);
		System.out.println("val: " + val + " studentResponse: " + studentResponse);
		return val.equals(studentResponse);
	}

	private Double getRoundOff(Double val) {
		BigDecimal a = new BigDecimal(val);
		BigDecimal b = a.setScale(1, RoundingMode.HALF_UP);
		return b.doubleValue();
	}

}
