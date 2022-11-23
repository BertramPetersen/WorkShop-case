package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Building {
    HashMap<UUID, Sensor> SensorMap;
    ArrayList<Sensor> SensorList;
    ArrayList<Actuator> ActuatorList;
    String name;
    UUID id;

    public Building(String name) {
        SensorMap = new HashMap<>();
        SensorList = new ArrayList<>();
        ActuatorList = new ArrayList<>();
        this.name = name;
        this.id = UUID.randomUUID();
    }

    public void addSensor(Sensor sensor){
        SensorMap.put(sensor.getId(), sensor);
        SensorList.add(sensor);
    }
    public void addActuator(Actuator act){
        ActuatorList.add(act);
    }


}
