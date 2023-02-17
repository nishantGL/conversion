package com.example.conversion.service;

import org.springframework.stereotype.Service;

@Service
public class TempConvertor {

	public Double celsiusToFahrenheit(Double celsius) {
		return (celsius * 9 / 5) + 32;
	}

	public Double celsiusToKelvin(Double celsius) {
		return celsius + 273.15;
	}

	public Double celsiusToRankine(Double celsius) {
		return (celsius * 9 / 5) + 491.67;
	}

	public Double fahrenheitToCelsius(Double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

	public Double fahrenheitToKelvin(Double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9 + 273.15;
	}

	public Double fahrenheitTorankine(Double fahrenheit) {
		return (fahrenheit - 32) + 491.67;
	}

	public Double kelvinToCelsius(Double kelvin) {
		return kelvin - 273.15;
	}

	public Double kelvinToFahrenheit(Double kelvin) {
		return (kelvin - 273.15) * 9 / 5 + 32;
	}

	public Double kelvinToRankine(Double kelvin) {
		return (kelvin - 273.15) * 9 / 5 + 491.67;
	}

	public Double rankineToCelsius(Double rankine) {
		return (rankine - 491.67) * 5 / 9;
	}

	public Double rankineToFahrenheit(Double rankine) {
		return (rankine - 491.67) + 32;
	}

	public Double rankineToKelvin(Double rankine) {
		return (rankine - 491.67) * 5 / 9 + 273.15;
	}
}
