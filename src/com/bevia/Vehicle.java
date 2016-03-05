package com.bevia;

/**
 * Created by vincent on 3/3/16.
 */
abstract class Vehicle {

    /**
     * A vehicle (from Latin: vehiculum[1]) is a mobile machine that transports people or cargo.
     * Typical vehicles include wagons, bicycles, motor vehicles (motorcycles, cars, trucks, buses),
     * railed vehicles (trains, trams), watercraft (ships, boats), aircraft and spacecraft.[2]
     *
     * Source: https://en.wikipedia.org/wiki/Vehicle
     */

    private String vehicleName;  // Airplane

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }
}
