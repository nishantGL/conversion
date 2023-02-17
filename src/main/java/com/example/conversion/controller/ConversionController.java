package com.example.conversion.controller;

import java.lang.reflect.InvocationTargetException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.conversion.model.Request;
import com.example.conversion.model.Response;
import com.example.conversion.service.ConversionSvc;

@RestController
@RequestMapping("/conversion")
public class ConversionController {

	@Autowired
	private ConversionSvc svc;
	@GetMapping("/test")
	public ResponseEntity<Response> testConversion(@RequestBody Request req) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException
	{
		Response rep = svc.testInput(req);
		return new ResponseEntity<Response>(rep, HttpStatus.OK) ;
	}
}
