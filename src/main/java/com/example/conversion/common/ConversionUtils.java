package com.example.conversion.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversionUtils {

	private static List<String> supportedVolUnits;
	private static List<String> supportedTemprUnits;

	static {

		supportedVolUnits = new ArrayList<>();
		supportedTemprUnits = new ArrayList<>();

		Arrays.asList(TemperatureEnum.values()).forEach(temp -> supportedTemprUnits.add(temp.getUnit()));
		Arrays.asList(VolumeEnum.values()).forEach(vol -> supportedVolUnits.add(vol.getUnit()));
	}
	
	public static List<String> getSupportedVolUnits()
	{
		return supportedVolUnits;
	}
	
	public static List<String> getSupportedTemprUnits()
	{
		return supportedTemprUnits;
	}
}
