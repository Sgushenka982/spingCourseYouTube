package ru.gushchinDA.springCourseYouTube;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
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
