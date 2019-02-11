package com.nt.service;

public final class IntAmtCalculator implements IntAmtCalculatorInterface {
	public final float calcIntrestAmt(float principle,float rate,float time) {
		System.out.println("Target Method");
		return (principle*rate*time)/100.0f;
	}
	

}
