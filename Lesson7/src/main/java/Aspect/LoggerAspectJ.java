package Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggerAspectJ {

    @Before("execution(* Aspect.Hello.*(..))")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("before method: " + joinPoint.getSignature().getName());
    }

    @After("execution(* Aspect.Hello.*(..))")
    public void logAfter(JoinPoint joinPoint){
        System.out.println("After method: " + joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(* Aspect.Hello.*(..))", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result){
        System.out.println("After return method: " + joinPoint.getSignature().getName());
        System.out.println("method returned value is: " + result);
    }

    @AfterThrowing(pointcut = "execution(* Aspect.Hello.*(..))", throwing = "error")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable error){
        System.out.println("exception in method: " + joinPoint.getSignature().getName());
        System.out.println("Exception is: " + error);
    }
}
