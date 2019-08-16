package com.trainingdeveloperpro.k001.danghuucanh.springaspectj;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class HelloAspectJ {
    public void method1(){
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("Method 1");
    }

    public String method2(){
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("Method 2");
        return "hello";
    }

    public void method3(){
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("Method 3");
        throw new IllegalArgumentException();
    }
}
