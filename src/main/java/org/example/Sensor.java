package org.example;

import java.util.UUID;

public abstract class Sensor {

    Building location;
    UUID id;


    public Building getLocation() {
        return location;
    }

    public UUID getId() {
        return id;
    }
}
