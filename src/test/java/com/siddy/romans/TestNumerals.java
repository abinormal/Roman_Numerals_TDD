package com.siddy.romans;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestNumerals {

    @Test
    public void testTheTestFails(){
        // Arrange
        RomanNumerals numerals = new RomanNumerals();
        // Act
        int result = numerals.getNumber("V");
        // Assert
        assertEquals(5, result);
    }

}
