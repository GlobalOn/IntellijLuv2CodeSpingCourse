package com.luv2code.springdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class EncourageFortuneService implements FortuneService {

    private final List<String> fortunesList = Arrays.asList("First fortune!", "Second fortune!", "Third fortune!");

    @Override
    public String getFortune() {
        return fortunesList.get(new Random().nextInt(3));
    }
}
