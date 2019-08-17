package com.k001.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello = (Hello)context.getBean("helloProxy");
        hello.method1();
        System.out.println("------------------------------------------------------------------------------------");
        hello.method2();
        System.out.println("------------------------------------------------------------------------------------");
        hello.method3();
    }
}
