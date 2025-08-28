package com.tutorial.springtutorial.common;

import org.springframework.stereotype.Component;

@Component
public class cricketCoach implements Coach {

    public cricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
