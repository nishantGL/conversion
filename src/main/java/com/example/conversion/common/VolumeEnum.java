package com.example.conversion.common;

public enum VolumeEnum {

	TABLESPOONS("tablespoons"),
	CUBIC_INCHES("cubic-inches"),
	CUPS("cups"),
	CUBIC_FEET("cubic-feet"),
	GALLONS("gallons");

	private final String unit;
	
	VolumeEnum(String unit) {
		this.unit = unit;
	}
	
	public String getUnit()
	{
		return this.unit;
	}
	
}
