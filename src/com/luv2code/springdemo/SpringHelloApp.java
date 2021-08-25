package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {
        //Load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        //Retrieve bean from Spring container
//        Coach theTennisCoach = context.getBean("myCoach", Coach.class);
//        //***CricketCoach
//        CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

        //Retrieve bean from Spring container
        TennisCoach theTennisCoach = context.getBean("myTennisCoach", TennisCoach.class);

        //Call methods on the bean
        System.out.println(theTennisCoach.getDailyWorkout());
        System.out.println(theTennisCoach.getDailyFortune());
        System.out.println(theTennisCoach.getName());
        System.out.println(theTennisCoach.getEmail());
        System.out.println(theTennisCoach.getTeam());
        //Close the context
        context.close();
    }
}
