package org.example;

import java.util.UUID;

public class CO2Sensor extends Sensor{

    double CO2_reading;

    public CO2Sensor(Building location){
        super.location = location;
        CO2_reading = 8.72;
        super.id = UUID.randomUUID();

    }

    public double getTemperature() {
        return CO2_reading;
    }
}

