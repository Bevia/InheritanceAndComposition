package com.bevia;

/**
 * Created by vincent on 3/3/16.
 */
abstract class Engine {

    private String typeOfEngine;//Car, Truck, Ship, Jet, other....
    private String notes;
    //private int horsePower;
    //private int torque;
    //private int weight;
    //private int size;


    public Engine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public abstract void technicalSpecificationsOfJetEngine ();
    //public abstract void engineWeight ();
    //public abstract void engineSize ();

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public String getNotes() {
        return "This is the info pertaining to the Engine of: \n";
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
