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
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
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

    //testCase for Inch validation
    //Testcase given 0Feet and 0feet should return equal
    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    //testCase given 0feet and 1feet return not equal
    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    //testCase given Not Equal for Null Value
    @Test
    public void given0InchAndNullInch_ShouldReturnNotEqual() {
        Inch inch1=new Inch(0.0);
        Inch inch2=null;
        Assertions.assertNotEquals(inch1,inch2);
    }

    //testCase given same Ref_value should return true
    @Test
   public void givenInchFromSameRef_Equal_shouldReturnTrue() {
        Inch inch=new Inch(1.0);
        boolean result=inch==inch;
        Assertions.assertTrue(result);
    }
    //testCase given Diff_ref value Should return false
    @Test
   public void givenInchFromDiffRef_Equal_shouldReturnFalse() {
        Inch inch1=new Inch(1.0);
        Inch inch2=new Inch(1.0);
        boolean result=inch1==inch2;
        Assertions.assertFalse(result);

    }
}
