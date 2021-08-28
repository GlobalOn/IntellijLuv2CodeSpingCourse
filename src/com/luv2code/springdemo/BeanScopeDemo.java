package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

    public static void main(String[] args) {

        //Load Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //Retrieve bean from context
        Coach theCoach = context.getBean("myCoach", Coach.class);
        TrackCoach trackCoach = context.getBean("myCoach", TrackCoach.class);

        System.out.println(theCoach==(trackCoach));
        System.out.println(theCoach.equals(trackCoach));
        System.out.println(theCoach);
        System.out.println(trackCoach);

        context.close();
    }
}
