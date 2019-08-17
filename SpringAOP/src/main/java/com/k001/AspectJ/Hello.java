package com.k001.AspectJ;

public class Hello {
    public void method1(){
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("method1");
    }
    public String method2(){
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("method2");
        return "hello";
    }
    public void method3(){
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("method3");
        throw new IllegalArgumentException();
    }
}
