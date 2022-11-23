package org.example;

import java.util.ArrayList;

public class SystemHub {

    ArrayList<Building> buildings;
    ArrayList<Sensor> sensors;
    ArrayList<Actuator> actuators;

    public SystemHub (){

    }

    public void addBuilding(Building building){
        buildings.add(building);
    }
}
