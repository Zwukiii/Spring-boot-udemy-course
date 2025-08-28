package com.tutorial.springtutorial.rest;

import com.tutorial.springtutorial.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

   @Autowired
   public void demoController(Coach theCoach) {
       myCoach = theCoach;
   }
    @GetMapping("/dailyworkout")
    private String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
