package com.bevia;

/**
 * Created by vincent on 3/3/16.
 */
public class Jet extends AirCraft{

    private String manufacturer;
    private String airlinerName;
    //private String countryOfOrigen;
    //private int numberOfPassengers;

    // A jet is not a jetEngine, so I don't want to inherit the class JetEngine, a jetEngine is a component of a jet
    // a jet has a jetEngine (in not a jetEngine).
    // now lets add the components (Objects) that a Jet has:  (we're going to keep it simple, juts three components)
    private JetEngine engine; //This is a -has a- type of relation, we'll use composition here!
    private JetWeatherRadarScanner radarScanner; //This is a -has a- type of relation, we'll use composition here!
    private JetRetractingLandingGear landingGear; //This is a -has a- type of relation, we'll use composition here!


    public Jet(String vehicleName, String aircraftType, String manufacturer, String airlinerName,
               JetEngine engine, JetWeatherRadarScanner radarScanner,
               JetRetractingLandingGear landingGear) {
        super(vehicleName, aircraftType);
        this.manufacturer = manufacturer;
        this.airlinerName = airlinerName;
        this.engine = engine;
        this.radarScanner = radarScanner;
        this.landingGear = landingGear;
    }



    //Utilizing composition:
    public JetRetractingLandingGear getLandingGear() {

        return landingGear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public JetEngine getEngine() {
        return engine;
    }

    public void setEngine(JetEngine engine) {
        this.engine = engine;
    }

    public JetWeatherRadarScanner getRadarScanner() {
        return radarScanner;
    }

    public void setRadarScanner(JetWeatherRadarScanner radarScanner) {
        this.radarScanner = radarScanner;
    }

    public void setLandingGear(JetRetractingLandingGear landingGear) {
        this.landingGear = landingGear;
    }
}
