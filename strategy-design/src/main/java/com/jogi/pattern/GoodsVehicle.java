package com.jogi.pattern;


import com.jogi.pattern.strategy.NormalDrive;

public class GoodsVehicle  extends Vehicle{
    GoodsVehicle() {
        super(new NormalDrive());
    }
}
