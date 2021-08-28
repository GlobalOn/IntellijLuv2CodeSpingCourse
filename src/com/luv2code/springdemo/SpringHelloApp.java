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
        TennisCoach theTennisCoach1 = context.getBean("myTennisCoach", TennisCoach.class);
        TennisCoach theTennisCoach2 = context.getBean("myTennisCoach", TennisCoach.class);

        //Call methods on the bean
        System.out.println(theTennisCoach1.getDailyWorkout());
        System.out.println(theTennisCoach1.getDailyFortune());
        System.out.println(theTennisCoach1.getName());
        System.out.println(theTennisCoach1.getEmail());
        System.out.println(theTennisCoach1.getTeam());
        //Close the context
        context.close();
    }
}
