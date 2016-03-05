# InheritanceAndComposition
JAVA: Usage of Inheritance and Composition.

a Jet Plane has several components (among many others of course, but 3 for the sake of simplicity):

1)a Jet Engine which contains (has-a) a Combustion Chamber (as a component)

2)a Retracting Landing Gear (as a component)

3)and a Weather Radar Scanner (as a component)

Now lets build a Jet Plane with all these components:
        
        This is what we have:
         
        Vehicle is the SUPERCLASS (which a you know inherits from Object)
        AirCraft extends Vehicle
        Jet extends AirCraft
        JetEngine extends Engine
        
        the Jet Class has 3 components:
         
        JetEngine
        JetWeatherRadarScanner and
        JetRetractingLandingGear

As you can see composition is very powerful!
Some videos and extra info shortly.

Cheers!
