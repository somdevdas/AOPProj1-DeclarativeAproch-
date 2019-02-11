package com.nt.aspect;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		Object retValue=null;
		System.out.println("Entering into : "+invocation.getMethod().getName()+"with arguments "+Arrays.toString(invocation.getArguments()));
		Object arg[]=invocation.getArguments();
		if((float)arg[0]<50000) {
			arg[1]=1.0f;
		}
		if((float)arg[0]==0.0f||(float)arg[1]==0.0f||(float)arg[2]==0.0f) {
			return 0.0f;
			
		} 
		else {
			retValue=invocation.proceed();
		}
		System.out.println("leaving from "+invocation.getMethod().getName()+" with arguments "+Arrays.toString(invocation.getArguments()));
		if((float)retValue<=25000) {
			return retValue;
		}
		else {
			return (((float)retValue)+((float)retValue)*0.1f);
		}
		
	}

}
