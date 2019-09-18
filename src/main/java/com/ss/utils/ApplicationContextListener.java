package com.ss.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextListener {
    public static  ApplicationContext applicationContext;
    public ApplicationContextListener(){
        System.out.println("listener init.....");
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
}
