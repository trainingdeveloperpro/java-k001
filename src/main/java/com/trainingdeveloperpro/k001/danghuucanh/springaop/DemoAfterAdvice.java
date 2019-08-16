package com.trainingdeveloperpro.k001.danghuucanh.springaop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class DemoAfterAdvice implements AfterReturningAdvice {
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable{
        System.out.println("after method: " + method.getName());
    }
}
