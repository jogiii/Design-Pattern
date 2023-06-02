package com.jogi.pattern.strategy;

public class NormalDrive implements DriveStrategy{
    @Override
    public void Drive() {
        System.out.println("Normal Drive");
    }
}
