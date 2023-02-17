package com.example.conversion.model;

import lombok.Data;

@Data
public class Request {

	private String inputValue;
	private String inputUnit;
	private String targetUnit;
	private String studentResponse;
	
	public String getInputValue() {
		return inputValue;
	}
	public void setInputValue(String inputValue) {
		this.inputValue = inputValue;
	}
	public String getInputUnit() {
		return inputUnit.toLowerCase().replaceAll("-", "_");
	}
	public void setInputUnit(String inputUnit) {
		this.inputUnit = inputUnit;
	}
	public String getTargetUnit() {
		return targetUnit.toLowerCase().replaceAll("-", "_");
	}
	public void setTargetUnit(String targetUnit) {
		this.targetUnit = targetUnit;
	}
	public String getStudentResponse() {
		return studentResponse;
	}
	public void setStudentResponse(String studentResponse) {
		this.studentResponse = studentResponse;
	}
	
	
	
}
