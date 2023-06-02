package com.jogi.pattern;


import com.jogi.pattern.strategy.SportsDrive;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        super(new SportsDrive());
    }
}
