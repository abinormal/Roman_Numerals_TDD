package com.siddy.romans;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestNumerals {

    @Test
    public void testGetsOne() {
        // Arrange
        RomanNumerals numerals = new RomanNumerals();
        // Act
        String result = numerals.getNumeral(1);
        // Assert
        assertEquals("I", result);
    }

    @Test
    public void testGetNine(){
        // Arrange
        RomanNumerals numerals = new RomanNumerals();
        // Act
        String result = numerals.getNumeral(9);
        // Assert
        assertEquals("IX", result);
    }

    @Test
    public void testGetZero(){
        // Arrange
        RomanNumerals numerals = new RomanNumerals();
        // Act
        String result = numerals.getNumeral(0);
        // Assert
        assertEquals("", result);
    }

    @Test
    public void testGetFourteen(){
        // Arrange
        RomanNumerals numerals = new RomanNumerals();
        // Act
        String result = numerals.getNumeral(14);
        // Assert
        assertEquals("XIV", result);
    }

    @Test
    public void testGetEightySix(){
        // Arrange
        RomanNumerals numerals = new RomanNumerals();
        // Act
        String result = numerals.getNumeral(86);
        // Assert
        assertEquals("LXXXVI", result);
    }

    @Test
    public void testGetNinetyNine(){
        // Arrange
        RomanNumerals numerals = new RomanNumerals();
        // Act
        String result = numerals.getNumeral(99);
        // Assert
        assertEquals("XCIX", result);
    }

    @Test
    public void testGetZeroThreeTwo(){
        // Arrange
        RomanNumerals numerals = new RomanNumerals();
        // Act
        String result = numerals.getNumeral(032);
        // Assert
        assertEquals("XXXII", result);
    }

    @Test
    public void testGetOneHundredAndThree(){
        // Arrange
        RomanNumerals numerals = new RomanNumerals();
        // Act
        String result = numerals.getNumeral(103);
        // Assert
        assertEquals("CIII", result);
    }

    @Test
    public void testGetNineHundredAndSeventy(){
        // Arrange
        RomanNumerals numerals = new RomanNumerals();
        // Act
        String result = numerals.getNumeral(970);
        // Assert
        assertEquals("CMLXX", result);
    }
}
