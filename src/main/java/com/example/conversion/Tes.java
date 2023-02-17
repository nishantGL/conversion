package com.example.conversion;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Tes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal a = new BigDecimal("111.524");
		BigDecimal b = a.setScale(1, RoundingMode.HALF_UP);
		System.out.println(b.doubleValue());
	}

}
