package task_5;

public enum RotorSystem {
    TANDEM("Tandem rotors"),
    TRANSVERSE("Transverse rotors"),
    COAXIAL("Coaxial rotors"),
    ANTI_TORQUE("Main & Anti-torque");

    private final String rotorSystem;
    RotorSystem(String rotorSystem){
        this.rotorSystem = rotorSystem;
    }
    public String getRotorSystem(){
        return rotorSystem;
    }
}
