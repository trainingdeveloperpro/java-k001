package com.trainingdeveloperpro.k001.danghuucanh;

import com.trainingdeveloperpro.k001.danghuucanh.springaop.Hello;
import com.trainingdeveloperpro.k001.danghuucanh.springaspectj.HelloAspectJ;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Hello hello = (Hello) context.getBean("hello");
//        hello.method1();
//        hello.method2();
//        System.out.println("\n");
//
//        Hello hello1 = (Hello) context.getBean("helloProxy");
//        hello1.method1();
//        System.out.println("\n");
//        hello1.method2();
//        System.out.println("\n");
//        hello1.method3();
//        System.out.println("\n");

        HelloAspectJ hello2 = (HelloAspectJ) context.getBean("hello2");
        hello2.method1();
        System.out.println("\n");
        hello2.method2();
        System.out.println("\n");
        hello2.method3();
        System.out.println("\n");
    }
}
