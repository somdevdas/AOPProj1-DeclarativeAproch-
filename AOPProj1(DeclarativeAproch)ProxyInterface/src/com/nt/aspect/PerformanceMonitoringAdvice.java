package com.nt.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformanceMonitoringAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		long startTime,endTime;
		Object retValue=null;
		startTime=System.currentTimeMillis();
		retValue=arg0.proceed();
		endTime=System.currentTimeMillis();
		System.out.println(arg0.getMethod().getName()+" Has Taken : "+(endTime-startTime)+" ms to");
		return retValue;
	}

}
