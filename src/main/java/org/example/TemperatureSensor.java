package org.example;

import java.util.UUID;

public class TemperatureSensor extends Sensor{

    double temperature;

    public TemperatureSensor(Building location){
        super.location = location;
        temperature = 21.0;
        super.id = UUID.randomUUID();

    }

    public double getTemperature() {
        return temperature;
    }


}
