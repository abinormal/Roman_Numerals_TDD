package com.siddy.romans;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestNumerals {
    /********************************************************
     * Get one digit numerals
     */
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
    /********************************************************
     * Get two digit numerals
     */
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

    /********************************************************
     * Get three digit numerals
     */

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

    @Test
    public void testGetFourHundredAndNinetyOne(){
        // Arrange
        RomanNumerals numerals = new RomanNumerals();
        // Act
        String result = numerals.getNumeral(970);
        // Assert
        assertEquals("CMLXX", result);
    }

    /********************************************************
     * Get four digit numerals
     */
    @Test
    public void testGetThreeThousandFiveHundredAndSixtyEight(){
        RomanNumerals numerals = new RomanNumerals();
        String result = numerals.getNumeral(3568);
        assertEquals("MMMDLXVIII", result);
    }
    @Test
    public void testGetTwoThousandAndNinetyOne(){
        RomanNumerals numerals = new RomanNumerals();
        String result = numerals.getNumeral(2091);
        assertEquals("MMXCI", result);
    }
    @Test
    public void testGetFourThousand(){
        RomanNumerals numerals = new RomanNumerals();
        String result = numerals.getNumeral(4000);
        assertEquals("MMMM", result);
    }
}
