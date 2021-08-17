package com.luv2code.springdemo;

public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Daily workout from tennisCoach!";
    }
}
