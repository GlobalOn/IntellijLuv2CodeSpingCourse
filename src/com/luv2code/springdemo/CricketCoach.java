package com.luv2code.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("Hello, I'm the line from  the constructor!");
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("Hello, I'm the line from  the Setter Method!");
    }

    @Override
    public String getDailyWorkout() {
        return "Push the tempo!!!";
    }

    @Override
    public String getDailyFortune() {
        return "The WITCHER SAID: " + fortuneService.getFortune();
    }
}
