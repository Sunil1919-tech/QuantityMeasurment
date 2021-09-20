package com.bridgelabz;

import java.util.Objects;

/**
 * declaring the Class Inch to call the value
 * Compare the Inch and Feet as well
 */
public class Inch {

    private final double value;

    public Inch(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return Double.compare(inch.value, value) == 0;
    }
}
