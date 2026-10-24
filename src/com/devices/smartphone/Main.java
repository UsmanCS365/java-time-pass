package com.devices.smartphone;

import com.devices.Camera;

public class Main {
    public static void main(String[] args) {
        Camera c1 = new SmartPhone();
        c1.takePhoto();
        c1.shootVideo();
    }
}