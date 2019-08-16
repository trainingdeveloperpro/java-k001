package springAop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class DemoAroundAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("around - before method: " + invocation.getMethod().getName());

        try {

            Object result = invocation.proceed();

            System.out.println("around - before method: " + invocation.getMethod().getName());

            return result;

        } catch (IllegalArgumentException e) {
            System.out.println("around - throw advice method: " + invocation.getMethod().getName());
            throw e;
        }
    }
}

