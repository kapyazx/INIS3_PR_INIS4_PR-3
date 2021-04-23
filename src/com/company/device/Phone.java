package com.company.device;

public class Phone extends Device {
    final public Double screenSize;
    final public String operationSystem;

    public Phone(String producer, String model, Double screenSize, String operationSystem, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
    }

    @Override
    public void turnOn() {
        System.out.println("Podaj odcisk palca");
    }
}


