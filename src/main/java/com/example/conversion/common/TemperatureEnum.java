package com.example.conversion.common;

public enum TemperatureEnum {

	KELVIN("kelvin"),
	CELSIUS("celsius"),
	FAHRENHEIT("fahrenheit"),
	RANKINE("rankine");

	private final String unit;
	
	TemperatureEnum(String unit) {
		this.unit = unit;
	}
	
	public String getUnit()
	{
		return this.unit;
	}
	
}
