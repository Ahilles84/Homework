package task_5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Aircraft ka32 = new CargoHelicopter("KA-32","EW-885347",2000,400,RotorSystem.COAXIAL,5000);
        Aircraft mi8 = new PassengerHelicopter("МИ-8","EW-785742",1500,350,RotorSystem.ANTI_TORQUE,24);
        Aircraft airbusA320 = new PassengerPlane("Airbus A320","EW-210545",6000,840,TypeOfEngine.TURBOJET,180);
        Aircraft an124 = new CargoPlane("АН-124","EW-206445",4800,850,TypeOfEngine.TURBOJET,120000);
        Aircraft celebrity = new BusinessJet("Embraer Phenom 300","EW-777777",5000,950,TypeOfEngine.TURBOFAN,12,true,false);
        Aircraft[] myAirPark = new Aircraft[]{ka32, mi8, airbusA320, an124, celebrity};
        System.out.println(MyAirline.totalCarrying(myAirPark));
        System.out.println(MyAirline.totalPassengerCapacity(myAirPark));
        MyAirline.sortByRange(myAirPark);
        System.out.println(Arrays.toString(myAirPark));
        ka32.showAircraftSpec();
        celebrity.showAircraftSpec();
    }
}
