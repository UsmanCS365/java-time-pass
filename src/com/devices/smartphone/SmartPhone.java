package com.devices.smartphone;
import com.devices.Camera;
public class SmartPhone implements  Camera {
    @Override 
    public void takePhoto() {
        System.out.println("Taking photo");
    }
    @Override 
    public void shootVideo() {
        System.out.println("Shooting video");
    }
}