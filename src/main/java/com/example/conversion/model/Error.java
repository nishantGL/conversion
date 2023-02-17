package com.example.conversion.model;

import org.springframework.http.HttpStatus;

public class Error {

	private int errorCode;
	private String devMessage;
	private String message;
	private HttpStatus httpStatus;
	
	
	public Error(int errorCode, String devMessage, String message, HttpStatus httpStatus) {
		super();
		this.errorCode = errorCode;
		this.devMessage = devMessage;
		this.message = message;
		this.httpStatus = httpStatus;
	}
	public Error() {}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getDevMessage() {
		return devMessage;
	}
	public void setDevMessage(String devMessage) {
		this.devMessage = devMessage;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	
	
}
