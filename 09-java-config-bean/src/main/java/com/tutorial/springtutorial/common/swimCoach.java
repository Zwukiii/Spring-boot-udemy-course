package com.tutorial.springtutorial.common;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class swimCoach implements Coach {

    public swimCoach() {
        System.out.println("in constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meter as a  warm up";
    }
}
