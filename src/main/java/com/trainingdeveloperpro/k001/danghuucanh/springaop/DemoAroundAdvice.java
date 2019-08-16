package com.trainingdeveloperpro.k001.danghuucanh.springaop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class DemoAroundAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable{
        //Same with BeforeAdvice
        System.out.println("around - before method: "+ invocation.getMethod().getName());

        try {
            //proceed to original method call
            Object result = invocation.proceed();

            //Same with AfterReturningAdvice
            System.out.println("around - after method: " + invocation.getMethod().getName());

            return result;
        } catch (IllegalArgumentException e){
            // Same with ThrowAdvice
            System.out.println("around - throw advice method: " + invocation.getMethod().getName());
            throw e;
        }
    }
}
