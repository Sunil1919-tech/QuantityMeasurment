package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {
    //testCase passing 0 feet value and should return true
    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    //testCase returns false
    @Test
    public void given0FeetAnd0Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    //testCase for Null Check
    @Test
    public void given0FeetAndNullFeet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    //testCase When DiffRef_Feet should return false
    @Test
    public void givenFeetFromDifferent_RefFeet_Equal_ShouldReturnFalse() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        boolean result = feet2 == feet1;
        Assertions.assertFalse(result);
    }

    //testCase When SameRef_Feet should return True
    @Test
    public void givenFeetFromSameRef_Equal_ShouldReturnTrue() {
        Feet feet = new Feet(0.0);
        boolean result = feet == feet;
        Assertions.assertTrue(result);
    }
}
