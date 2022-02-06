package ru.gushchinDA.springCourseYouTube;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class ClassicalMusic implements Music{

    @PostConstruct
    public void doMyInit() {
        System.out.println("Do my initialization");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Do my Destruction");
    }

    @Override
    public String getSong() {
        return "Hungurian rapsody";
    }
}
