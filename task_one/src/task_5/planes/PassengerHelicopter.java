package task_5.planes;

import task_5.enums.RotorSystem;
import task_5.impl.Passenger;

public class PassengerHelicopter extends Helicopter implements Passenger {
    private int passengerCapacity;

    public PassengerHelicopter(String name, String registrationNumber, int rangeOfFlight, int cruisingSpeed, RotorSystem rotorSystem, int passengerCapacity) {
        super(name, registrationNumber, rangeOfFlight, cruisingSpeed, rotorSystem);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public int getPassengerCapacity() {
        return this.passengerCapacity;
    }

    @Override
    public int getCarryingCapacity() {
        return 0;
    }
}
