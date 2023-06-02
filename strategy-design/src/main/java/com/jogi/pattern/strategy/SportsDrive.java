package com.jogi.pattern.strategy;

public class SportsDrive implements DriveStrategy {
    @Override
    public void Drive() {
        System.out.println("Sports Drive");
    }
}
