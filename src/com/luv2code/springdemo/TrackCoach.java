package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(){
    }

    public TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Daily workout from trackCoach!";
    }

    @Override
    public String getDailyFortune() {
        return "YES! You can! " + fortuneService.getFortune();
    }
}
