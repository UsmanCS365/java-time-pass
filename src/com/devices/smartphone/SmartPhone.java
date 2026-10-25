package com.devices.smartphone;
import com.devices.Camera;
import com.devices.MediaPlayer;
public class SmartPhone implements  Camera, MediaPlayer {
    @Override 
    public void takePhoto() {
        System.out.println("Taking photo");
    }
    @Override 
    public void shootVideo() {
        System.out.println("Shooting video");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video");
    }
}