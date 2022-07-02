package com.rk;

import java.math.BigDecimal;

public class BigDecimalclass {
	
	public static void main(String[] args) {
		
		BigDecimal number1 = new BigDecimal("34.56789678");
		BigDecimal number2 = new BigDecimal("34.2243");
		System.out.println(number1.add(number2));
		
		BigDecimal number3 = number1.add(number2);
		
		System.out.println(number3);
		System.out.println(number1);

	}
}
