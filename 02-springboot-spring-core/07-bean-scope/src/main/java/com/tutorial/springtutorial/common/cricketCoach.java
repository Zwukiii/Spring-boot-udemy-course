package com.tutorial.springtutorial.common;

import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
public class cricketCoach implements Coach {

    public cricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @PostMapping
    public void  doMyStartupStuff() {
        System.out.println("in doMyStartupStuff()" + getClass().getSimpleName());
    }


    @PreDestroy
    public void  doMycleanupStuff() {
        System.out.println("in doMyStartupStuff()" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
