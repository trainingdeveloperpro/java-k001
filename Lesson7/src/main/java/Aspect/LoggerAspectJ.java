package Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggerAspectJ {

    @Before("execution(* Aspect.Hello.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("before method: " + joinPoint.getSignature().getName());
    }

    @After("execution(* Aspect.Hello.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("after method: " + joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(* Aspect.Hello.method2(..))", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("after return method : " + joinPoint.getSignature().getName());
        System.out.println("Method returned value is : " + result);
    }

    @AfterThrowing(pointcut = "execution(* Aspect.Hello.*(..))", throwing = "error")
    public void logThrow(JoinPoint joinPoint, Throwable error) {
        System.out.println("exception in method: " + joinPoint.getSignature().getName());
        System.out.println("Exception is: " + error);

    }
}
