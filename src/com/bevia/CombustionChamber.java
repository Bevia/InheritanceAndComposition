package com.bevia;

/**
 * Created by vincent on 3/3/16.
 */
public class CombustionChamber {

    private String combustionChamberModel;
    private String combustionChamberSpec;
    private int numberOfFuelInjectors;
    private int numberOfRotatorBlades;
    //private String igniterModel;
    //private double pressure;
    //private double maxTemperature;


    public CombustionChamber(String combustionChamberModel, int numberOfFuelInjectors, int numberOfRotatorBlades) {
        this.combustionChamberModel = combustionChamberModel;
        this.numberOfFuelInjectors = numberOfFuelInjectors;
        this.numberOfRotatorBlades = numberOfRotatorBlades;
    }

    public void combustionChamberSpecification(){

        combustionChamberSpec = "Combustion chambers: 10 can-type reverse flow";
    }

    public String getCombustionChamberModel() {
        return combustionChamberModel;
    }

    public void setCombustionChamberModel(String combustionChamberModel) {
        this.combustionChamberModel = combustionChamberModel;
    }

    public int getNumberOfFuelInjectors() {
        return numberOfFuelInjectors;
    }

    public void setNumberOfFuelInjectors(int numberOfFuelInjectors) {
        this.numberOfFuelInjectors = numberOfFuelInjectors;
    }

    public int getNumberOfRotatorBlades() {
        return numberOfRotatorBlades;
    }

    public void setNumberOfRotatorBlades(int numberOfRotatorBlades) {
        this.numberOfRotatorBlades = numberOfRotatorBlades;
    }
}
