package com.jogi.pattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        Vehicle vehicle1 = new GoodsVehicle();
        Vehicle vehicle2 = new OffRoadVehicle();

        vehicle.drive();
        vehicle1.drive();
        vehicle2.drive();
    }
}
