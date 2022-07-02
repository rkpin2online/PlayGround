package com.rk;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
		
	BigDecimal principal;
	BigDecimal intrest;
	
	public SimpleInterestCalculator(String principal, String intrest) {
		this.principal = new BigDecimal(principal);
		this.intrest = new BigDecimal(intrest);
	}

	public BigDecimal calculateTotalValue(int noOfYear) {
		//Total value = principal + principal * interest * noOfYear
		BigDecimal totalValue = principal.add(principal.multiply(intrest.multiply(new BigDecimal(noOfYear))));
		return totalValue;
	}

}
