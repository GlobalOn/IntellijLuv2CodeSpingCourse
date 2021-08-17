package com.luv2code.springdemo;

public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Daily workout from baseballCoach!";
    }
}
