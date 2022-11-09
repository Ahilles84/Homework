package task_12.impl;

public interface Validatable {
    default void validator(double measure){
        if (measure <= 0) throw new IllegalArgumentException("Measurement must not be negative or zero!");
    }
}
