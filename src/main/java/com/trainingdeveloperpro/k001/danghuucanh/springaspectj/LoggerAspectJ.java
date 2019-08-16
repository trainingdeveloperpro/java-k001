package com.trainingdeveloperpro.k001.danghuucanh.springaspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.ThrowsAdvice;

@Aspect
public class LoggerAspectJ {
    @Before("execution(* com.trainingdeveloperpro.k001.danghuucanh.springaspectj.HelloAspectJ.*(..))")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("before method : " + joinPoint.getSignature().getName());
    }

    @After("execution(* com.trainingdeveloperpro.k001.danghuucanh.springaspectj.HelloAspectJ.*(..))")
    public void logAfter(JoinPoint joinPoint){
        System.out.println("after method : " + joinPoint.getSignature().getName());
    }

    @AfterReturning (pointcut = "execution(* com.trainingdeveloperpro.k001.danghuucanh.springaspectj.HelloAspectJ.method2(..))", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result){
        System.out.println("after return method : " + joinPoint.getSignature().getName());
        System.out.println("Method returned value is : " + result);
    }

    @AfterThrowing (pointcut = "execution(* com.trainingdeveloperpro.k001.danghuucanh.springaspectj.HelloAspectJ.*(..))", throwing = "error")
    public void logThrow(JoinPoint joinPoint, Throwable error){
        System.out.println("Exception in method : " + joinPoint.getSignature().getName());
        System.out.println("Exception is : " + error);
    }
}
