package com.jogi.pattern;

import com.jogi.pattern.strategy.SportsDrive;

public class SportsVehicle  extends Vehicle{
    SportsVehicle() {
        super(new SportsDrive());
    }
}
