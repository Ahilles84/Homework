package task_5;

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


    public static void sortByRange(Aircraft[] airPark){
        for (int i = 0; i < airPark.length; i++) {
            int maxRange = airPark[i].getRangeOfFlight();
            Aircraft temp;
            for (int j = i; j < airPark.length; j++) {
                if (airPark[j].getRangeOfFlight() >= maxRange) {
                    maxRange = airPark[j].getRangeOfFlight();
                    temp = airPark[j];
                    airPark[j] = airPark[i];
                    airPark[i] = temp;
                }
            }
        }
    }
}
