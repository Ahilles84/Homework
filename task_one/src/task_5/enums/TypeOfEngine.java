package task_5.enums;

public enum TypeOfEngine {
  RECIPROCATING_ENGINE("Reciprocating engine"),
  TURBOJET("Turbojet"),
  TURBOFAN("Turbofan");
  private final String typeOfEngine;

  TypeOfEngine(String typeOfEngine) {
    this.typeOfEngine = typeOfEngine;
  }

  public String getTypeOfEngine() {
    return typeOfEngine;
  }
}
