package com.example.conversion.validator;



import org.springframework.stereotype.Component;

import com.example.conversion.common.ConversionUtils;
import com.example.conversion.exception.ConversionException;
import com.example.conversion.model.Request;

@Component
public class ValidateConversionRequest {



	public void validateRequest(Request request) {
		try {
			Double.parseDouble(request.getInputValue());
		} catch (NumberFormatException ex) {
			throw new ConversionException("Invalid input value");
		}

		boolean isValidTempUnit = isValidTempUnit(request.getInputUnit(), request.getTargetUnit());
		boolean isValidVolUnit = isValidVolUnit(request.getInputUnit(), request.getTargetUnit());
		
		if(!(isValidTempUnit || isValidVolUnit))
		{
			throw new ConversionException("Invalid input units");
		}
		
		try {
			Double.parseDouble(request.getStudentResponse());
		} catch (NumberFormatException ex) {
			throw new ConversionException("Invalid student response value");
		}
	}

	private boolean isValidVolUnit(String inputUnit, String targetUnit) {
		return ConversionUtils.getSupportedVolUnits().contains(inputUnit) 
				&& ConversionUtils.getSupportedVolUnits().contains(targetUnit);
	}

	private boolean isValidTempUnit(String inputUnit, String targetUnit) {
		return ConversionUtils.getSupportedTemprUnits().contains(inputUnit) 
				&& ConversionUtils.getSupportedTemprUnits().contains(targetUnit);
	}
}
