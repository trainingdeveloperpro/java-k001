package com.k001.AspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello = (Hello)context.getBean("hello2");
        hello.method1();
        System.out.println("------------------------------------------------------------------------------------");
        hello.method2();
        System.out.println("------------------------------------------------------------------------------------");
        hello.method3();
    }
}
