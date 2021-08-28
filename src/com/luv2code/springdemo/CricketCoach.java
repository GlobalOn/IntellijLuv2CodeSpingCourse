package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String team;
    private String name;

    public CricketCoach() {
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public String getName() {
        return name;
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
