package com.devices.smartphone;

import com.devices.Camera;
import com.devices.MediaPlayer;

public class Main {
    public static void main(String[] args) {
        Camera c1 = new SmartPhone();
        c1.takePhoto();
        c1.shootVideo();
        MediaPlayer m1 = new SmartPhone();
        m1.playMusic();
        m1.playVideo();
    }
}