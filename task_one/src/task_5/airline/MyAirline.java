package task_5.airline;

import task_5.enums.RotorSystem;
import task_5.enums.TypeOfEngine;
import task_5.planes.*;

public class MyAirline {
  private Aircraft ka32 =
      new CargoHelicopter("KA-32", "EW-885347", 2000, 400, RotorSystem.COAXIAL, 5000);
  private Aircraft mi8 =
      new PassengerHelicopter("МИ-8", "EW-785742", 1500, 350, RotorSystem.ANTI_TORQUE, 24);
  private Aircraft airbusA320 =
      new PassengerPlane("Airbus A320", "EW-210545", 6000, 840, TypeOfEngine.TURBOJET, 180);
  private Aircraft an124 =
      new CargoPlane("АН-124", "EW-206445", 4800, 850, TypeOfEngine.TURBOJET, 120000);
  private Aircraft celebrity =
      new BusinessJet(
          "Embraer Phenom 300", "EW-777777", 5000, 950, TypeOfEngine.TURBOFAN, 12, true, false);
  private Aircraft[] myAirPark = new Aircraft[] {ka32, mi8, airbusA320, an124, celebrity};

  public Aircraft[] getMyAirPark() {
    return myAirPark;
  }

  public Aircraft getKa32() {
    return ka32;
  }

  public Aircraft getMi8() {
    return mi8;
  }

  public Aircraft getAirbusA320() {
    return airbusA320;
  }

  public Aircraft getAn124() {
    return an124;
  }

  public Aircraft getCelebrity() {
    return celebrity;
  }
}
