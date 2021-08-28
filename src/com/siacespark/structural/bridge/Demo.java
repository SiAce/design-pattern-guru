package com.siacespark.structural.bridge;

import com.siacespark.structural.bridge.devices.Device;
import com.siacespark.structural.bridge.devices.Radio;
import com.siacespark.structural.bridge.devices.Tv;
import com.siacespark.structural.bridge.remotes.AdvancedRemote;
import com.siacespark.structural.bridge.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
