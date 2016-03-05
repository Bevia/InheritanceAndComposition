package com.bevia;

/**
 * Created by vincent on 3/3/16.
 */
public class JetRetractingLandingGear {

    private String manufacturer;
    private int numberOfWheels;

    public JetRetractingLandingGear(String manufacturer, int numberOfWheels) {
        this.manufacturer = manufacturer;
        this.numberOfWheels = numberOfWheels;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
