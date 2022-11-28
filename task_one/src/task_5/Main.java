package task_5;

import task_5.airline.MyAirline;
import task_5.airline.Service;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    MyAirline legolegend = new MyAirline();
    System.out.println(Service.totalCarrying(legolegend.getMyAirPark()));
    System.out.println(Service.totalPassengerCapacity(legolegend.getMyAirPark()));
    Service.sortByRange(legolegend.getMyAirPark());
    System.out.println(Arrays.toString(legolegend.getMyAirPark()));
    legolegend.getKa32().showAircraftSpec();
    legolegend.getCelebrity().showAircraftSpec();
  }
}
