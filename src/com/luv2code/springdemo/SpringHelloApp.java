package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {
        //Load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Retrieve bean from Spring container
        Coach theCoach = context.getBean("baseballCoach", Coach.class);
        //Call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        //Close the context
        context.close();
    }
}
