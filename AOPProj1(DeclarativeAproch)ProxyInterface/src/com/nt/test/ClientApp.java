package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.IntAmtCalculator;
import com.nt.service.IntAmtCalculatorInterface;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=null;
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cfg/applicationContext.xml");
		IntAmtCalculatorInterface proxy=ctx.getBean("tar",IntAmtCalculator.class);
		float intrest=proxy.calcIntrestAmt(60000, 2, 1);
		System.out.println(intrest);
		float intr2=proxy.calcIntrestAmt(1000, 1, 1);
		System.out.println(intr2);

	}

}
