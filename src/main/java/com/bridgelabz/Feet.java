package com.bridgelabz;

/**
 * declaring the Feet class to call value
 */
public class Feet {

    private final double value;

    public Feet(Double value) {
        this.value = value;
    }
//overridden the equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.value, value) == 0;
    }
}
