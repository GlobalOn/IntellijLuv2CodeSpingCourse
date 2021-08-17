package com.luv2code.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    public CricketCoach() {
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
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
