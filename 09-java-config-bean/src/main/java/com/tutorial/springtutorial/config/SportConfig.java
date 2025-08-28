package com.tutorial.springtutorial.config;

import com.tutorial.springtutorial.common.Coach;
import com.tutorial.springtutorial.common.swimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new swimCoach();
    }
}
