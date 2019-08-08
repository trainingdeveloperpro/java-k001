package com.k001.javabackend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContext {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        DataResource obj = (DataResource) context.getBean("dataResource");
        obj.printConnection();
    }

}
