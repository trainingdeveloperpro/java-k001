package com.k001.javabackend;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class BeanFactory {

    public static void main (String[] args){
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions (new ClassPathResource("beans.xml"));
        HelloWorld obj = (HelloWorld) factory.getBean("helloworld");
        obj.getMessage();
    }
}
