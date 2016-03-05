package com.bevia;

/**
 * Created by vincent on 3/3/16.
 */
public class AirCraft extends Vehicle{

    private String aircraftType;  // comercial airplane

    public AirCraft(String vehicleName, String aircraftType) {
        super(vehicleName);
        this.aircraftType = aircraftType;

    }
}
