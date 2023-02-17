package com.example.conversion.service;

import org.springframework.stereotype.Service;

@Service
public class VolumeConvertor {

	class Litres {
		/**
		 * Converts the supplied Litres value to Tablespoons
		 * 
		 * @param value The Litres input value
		 * @return The value in Tablespoons
		 */
		public static double toTablespoons(double value) {
			return value / 0.017758171402343747584;
		}

		/**
		 * Converts the supplied Litres value to Cubic Inches
		 * 
		 * @param value The Litres input value
		 * @return The value in Cubic Inches
		 */
		public static double toCubicInches(double value) {
			return value * 61.0237;
		}

		/**
		 * Converts the supplied Litres value to Cups
		 * 
		 * @param value The Litres input value
		 * @return The value in Cups
		 */
		public static double toCups(double value) {
			return value / 0.23658823649999998976;
		}

		/**
		 * Converts the supplied Litres value to Cubic Feet
		 * 
		 * @param value The Litres input value
		 * @return The value in Cubic Feet
		 */
		public static double toCubicFeet(double value) {
			return value / 28.3168;
		}

		/**
		 * Converts the supplied Litres value to Gallons
		 * 
		 * @param value The Litres input value
		 * @return The value in Gallons
		 */
		public static double toGallons(double value) {
			return value / 4.546091879;
		}
	}

	class Tablespoons {
		/**
		 * Converts the supplied Tablespoons value to Litres
		 * 
		 * @param value The Tablespoons input value
		 * @return The value in Litres
		 */
		public static double toLitres(double value) {
			return value * 0.017758171402343747584;
		}

		/**
		 * Converts the supplied Tablespoons value to Gallons
		 * 
		 * @param value The Tablespoons input value
		 * @return The value in Gallons
		 */
		public static double toGallons(double value) {
			return value / 256.0;
		}

		/**
		 * Converts the supplied Tablespoons value to Cups
		 * 
		 * @param value The Tablespoons input value
		 * @return The value in Cups
		 */
		public static double toCups(double value) {
			return value / 13.322781447462250496;
		}

		/**
		 * Converts the supplied Tablespoons value to Cubic Feet
		 * 
		 * @param value The Tablespoons input value
		 * @return The value in Cubic Feet
		 */
		public static double toCubicFeet(double value) {
			return value / 1594.58;
		}

		/**
		 * Converts the supplied Tablespoons value to Cubic Inches
		 * 
		 * @param value The Tablespoons input value
		 * @return The value in Cubic Inches
		 */
		public static double toCubicInches(double value) {
			return value * 1.08367;
		}
	}
	
}
