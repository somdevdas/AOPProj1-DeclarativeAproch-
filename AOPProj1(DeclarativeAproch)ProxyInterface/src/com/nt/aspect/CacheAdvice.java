package com.nt.aspect;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CacheAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		Map<String,Object> cache=new HashMap<String,Object>();
		String key=arg0.getMethod().getName()+Arrays.toString(arg0.getArguments());
		Object retValue;
		if(!cache.containsKey(key)) {
			retValue=arg0.proceed();
			cache.put(key, retValue);
			System.out.println("from target method");
			return retValue;
			
		}
		System.out.println("from cache");
		return cache.get(key);
	}

}
