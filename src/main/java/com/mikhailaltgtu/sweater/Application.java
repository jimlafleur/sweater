package com.mikhailaltgtu.sweater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//ComponentScan({"com.mikhailaltgtu.sweater.repos", "com.mikhailaltgtu.sweater.domain"})
@EntityScan("com.mikhailaltgtu.sweater.domain")

//@EnableJpaRepositories("com.mikhailaltgtu.sweater")
//@Configuration
//@EnableJpaRepositories(basePackages = {"com.mikhailaltgtu.sweater"})
//@EnableTransactionManagement
//@ComponentScan({"com.mikhailaltgtu.sweater.repos"})
public class Application<ComponentScan> {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
