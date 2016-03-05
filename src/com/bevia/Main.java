package com.bevia;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nSpecifying a Jet: ");

        /**
                So we know that a Jet Plane has several components (among many other, but 3 for the sake of simplicity):
                1)a Jet Engine which contains (has-a) a Combustion Chamber (as a component)
                2)a Retracting Landing Gear
                3)and a Weather Radar Scanner

            Now lets build a Jet Plane with all these components:
         */

        /*
        This is what we have:
         */
        //Vehicle is the SUPERCLASS (which a you know inherits from Object)
        //AirCraft extends Vehicle
        //Jet extends AirCraft
        //JetEngine extends Engine
        /*
        the Jet Class has 3 components:
         */
        //JetEngine
        //JetWeatherRadarScanner and
        //JetRetractingLandingGear

        //lets set some minimum specifications:

        //CombustionChamber newCombustionChamber = new CombustionChamber("RT-C67",12, 8);
        //JetEngine newEngine = new JetEngine("Aircraft Jet Engine","Turbo FAN Engine", newCombustionChamber);

        //From above...you could also create CombustionChamber class on the fly like so (saving yourself one line of code ;)
        JetEngine newEngine = new JetEngine("Aircraft Jet Engine","Turbo FAN Engine", new CombustionChamber("RT-C67", 12, 8));

        JetWeatherRadarScanner newJetWeatherRadarScanner = new JetWeatherRadarScanner("HP", "Cross-Sectional", 40);
        JetRetractingLandingGear newJetRetractingLandingGear = new JetRetractingLandingGear("PIC", 12);

        Jet newJet = new Jet("AirBus 323", "Comercial Airliner", "Airbus", "Iberia", newEngine,
                newJetWeatherRadarScanner, newJetRetractingLandingGear);

        //Now lets print some stuff from inherit classes and also components:
        System.out.println("\n" + newEngine.getNotes() //this method is a getter from the superclass Engine...
                +newJet.getManufacturer() +"  " //this method is a getter from Jet Class...
                +newEngine.getJetEngineType() +" " //this getter method is from JetEngine Class...
                +newEngine.getCombustionChamber().getNumberOfFuelInjectors()+" " //this is from getter in CombustionChamber through JetEngine
                +newEngine.getCombustionChamber().getCombustionChamberModel()); //this is from getter in CombustionChamber through JetEngine

        //now we're going to access the method in of one of the components...
        //the method is in: JetEngine but we accesse it via the getter in jet, like so:
        newJet.getEngine().technicalSpecificationsOfJetEngine();

        //as you can see composition is very powerful!
        //Some videos and extra info shortly.
        //Cheers!
    }
}
