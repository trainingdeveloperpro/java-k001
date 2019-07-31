package com.trainingdeveloperpro.k001.danghuucanh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld helloWorld1 = (HelloWorld) context.getBean("helloWorld1");
        helloWorld1.print();

        HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorld2");
        helloWorld2.print();
    }
}
