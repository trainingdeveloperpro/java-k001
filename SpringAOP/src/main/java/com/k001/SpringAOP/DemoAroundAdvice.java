package com.k001.SpringAOP;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class DemoAroundAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        // same with MethodBeforeAdvice
        System.out.println("around - before method: " + methodInvocation.getMethod().getName());
        try{
            //same with AfterReturningAdvice
            Object result = methodInvocation.proceed();
            System.out.println("around - before method: " + methodInvocation.getMethod().getName());
            return result;
        } catch (IllegalArgumentException e){
            //same with ThrowsAdvice
            System.out.println("around - throw advice method: " + methodInvocation.getMethod().getName());
            throw e;
        }
    }
}