package com.example.conversion.exception;

import com.example.conversion.model.Error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionAdvice {

	@ExceptionHandler(ConversionException.class)
	public ResponseEntity<Error> handelConversionExp(ConversionException exp) {
		Error err = new Error(440011, exp.getMessage(), "Error in conversion", HttpStatus.BAD_REQUEST);
		return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Error> handelConversionExp(Exception exp) {
		Error err = new Error(440022, exp.getMessage(), "Internal Exception", HttpStatus.INTERNAL_SERVER_ERROR);
		return new ResponseEntity<>(err, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
