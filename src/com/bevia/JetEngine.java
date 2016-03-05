package com.bevia;

/**
 * Created by vincent on 3/3/16.
 */
public class JetEngine extends Engine {

    private int staticThrust;
    private String compressorSpec;
    private String turbineSpec;

    //private String jetEngineManufacturer; //name of manufacturer
    private String jetEngineType; //Turbo FAN Engine
    //private String model; //model number or name
    //private int numberOfTurbines;
    //private String typeOfCompressor;
    private CombustionChamber combustionChamber; //This is a -has a- type of relation, we'll use composition here!

    public JetEngine(String typeOfEngine, String jetEngineType, CombustionChamber combustionChamber) {
        super(typeOfEngine);
        this.jetEngineType = jetEngineType;
        this.combustionChamber = combustionChamber;
    }

    public void technicalSpecificationsOfJetEngine() {
        staticThrust = 700; //Kg
        compressorSpec = "double-sided single stage centrifugal";
        turbineSpec = "single stage axial";
        System.out.println("\nJet Engine Tech Spec: " + "\nStaic Thrust: " + staticThrust + "\nCompressor Spec: compressorSpec"
        + "\nTurbine Spec: " + turbineSpec);
    }

    public String getJetEngineType() {
        return jetEngineType;
    }

    public void setJetEngineType(String jetEngineType) {
        this.jetEngineType = jetEngineType;
    }

    public CombustionChamber getCombustionChamber() {
        return combustionChamber;
    }

    public void setCombustionChamber(CombustionChamber combustionChamber) {
        this.combustionChamber = combustionChamber;
    }

}
