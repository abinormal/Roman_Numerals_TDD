package com.siddy.romans;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestNumerals {

    @Test
    public void testGetsFive() {
        // Arrange
        RomanNumerals numerals = new RomanNumerals();
        // Act
        String result = numerals.getNumeral(5);
        // Assert
        assertEquals("V", result);
    }

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
    public void testGetsNine() {
        // Arrange
        RomanNumerals numerals = new RomanNumerals();
        // Act
        String result = numerals.getNumeral(9);
        // Assert
        assertEquals("IX", result);
    }
}
