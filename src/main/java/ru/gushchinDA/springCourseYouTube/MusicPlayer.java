package ru.gushchinDA.springCourseYouTube;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String name;

    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //IoC
    public MusicPlayer(List musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer(){}

    public void setMusic(List musicList){
        this.musicList=musicList;
    }

    public void playMusic(){
        musicList.forEach(music->System.out.println("Playing: " + music.getSong()));

    }
}
