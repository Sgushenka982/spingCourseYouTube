package ru.gushchinDA.springCourseYouTube;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music{
    @Override
    public String getSong() {
        return "Lose yourself";
    }
}
