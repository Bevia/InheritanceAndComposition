package com.bevia;

/**
 * Created by vincent on 3/3/16.
 */
public class JetWeatherRadarScanner {

    private String manufacturer;
    private String radarType;
    private int range;

    public JetWeatherRadarScanner(String manufacturer, String radarType, int range) {
        this.manufacturer = manufacturer;
        this.radarType = radarType;
        this.range = range;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String getRadarType() {
        return radarType;
    }

    public void setRadarType(String radarType) {
        this.radarType = radarType;
    }
}
