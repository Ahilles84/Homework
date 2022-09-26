package task_5;

import java.util.Arrays;

public class MyAirline {
    public static int totalCarrying (Aircraft[] airPark){
        int totalCarryingCapacity = 0;
        for (Aircraft craft:airPark) {
            totalCarryingCapacity = totalCarryingCapacity + craft.getCarryingCapacity();
        }
        return totalCarryingCapacity;
    }
    public static int totalPassengerCapacity(Aircraft[] airPark){
        int totalPassengerCapacity = 0;
        for (Aircraft craft:airPark){
            totalPassengerCapacity = totalPassengerCapacity + craft.getPassengerCapacity();
        }
        return totalPassengerCapacity;
    }

    public static void showAircraftSpec(Aircraft aircraft){
        System.out.println(" Technical specifications: \n" + "Range: " + aircraft.getRangeOfFlight() + " meters; \n" +
                "Cruising speed: " + aircraft.getCruisingSpeed() + " km/h; \n"+
                "Type of engine: " + aircraft.getTypeOfEngine() + "\n" +
                "Rotor system: " + aircraft.getRotorSystem() + "\n" +
                "Carrying capacity: " + aircraft.getCarryingCapacity() + " kg; \n" +
                "Passenger capacity: " + aircraft.getPassengerCapacity());
    }

    public static Aircraft[] sortByRange(Aircraft[] airPark){
        Aircraft[] sortedByRange = new Aircraft[airPark.length];
        int index = 0;
        while (index < sortedByRange.length) {
            int maxRange = airPark[index].getRangeOfFlight();
            for (int i = 1; i < airPark.length; i++) {
                if (airPark[i].getRangeOfFlight() > maxRange) {
                    maxRange = airPark[i].getRangeOfFlight();
                    sortedByRange[index] = airPark[i];
                }
            }
            index++;
        }
        return sortedByRange;
    }

    public static void main(String[] args) {
        Aircraft ka32 = new CargoHelicopter(2000,400,"EW-885347",RotorSystem.COAXIAL,5000);
        Aircraft mi8 = new PassengerHelicopter(1500,350,"EW-785742",RotorSystem.ANTI_TORQUE,24);
        Aircraft airbusA320 = new PassengerPlane(6000,840,"EW-210545",TypeOfEngine.TURBOJET,180);
        Aircraft an124 = new CargoPlane(4800,850,"EW-206445",TypeOfEngine.TURBOJET,120000);
        Aircraft celebrity = new BusinessJet(5000,950,"EW-777777",TypeOfEngine.TURBOFAN,12,true,false);
        Aircraft[] myAirPark = new Aircraft[]{ka32, mi8, airbusA320, an124, celebrity};
        System.out.println(totalCarrying(myAirPark));
        System.out.println(totalPassengerCapacity(myAirPark));
        showAircraftSpec(ka32);
        System.out.println(Arrays.toString(sortByRange(myAirPark)));
    }
}
