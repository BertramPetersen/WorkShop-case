package org.example;

import java.util.ArrayList;
import java.util.UUID;

public class Building {
    ArrayList<Sensor> SensorList;
    ArrayList<Actuator> ActuatorList;
    String name;
    UUID id;

    public Building(ArrayList<Sensor> sensorList, ArrayList<Actuator> actuatorList, String name, UUID id) {
        SensorList = sensorList;
        ActuatorList = actuatorList;
        this.name = name;
        this.id = id;
    }
}
