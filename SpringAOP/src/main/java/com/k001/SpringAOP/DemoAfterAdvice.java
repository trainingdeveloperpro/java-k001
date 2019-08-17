package com.k001.SpringAOP;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class DemoAfterAdvice implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("after method: " + method.getName());
    }
}
