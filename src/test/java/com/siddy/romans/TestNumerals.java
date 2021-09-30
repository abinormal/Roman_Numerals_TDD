package com.siddy.romans;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestNumerals {
    /********************************************************
     * Get one digit numerals
     */
    RomanNumerals numerals;
    @Before
    public void setup(){
         numerals = new RomanNumerals();
    }

    @Test
    public void testGetsOne() {
        String result = numerals.getNumeral(1);
        assertEquals("I", result);
    }

    @Test
    public void testGetNine() {
        String result = numerals.getNumeral(9);
        assertEquals("IX", result);
    }

    @Test
    public void testGetZero() {
        String result = numerals.getNumeral(0);
        assertEquals("", result);
    }

    /********************************************************
     * Get two digit numerals
     */
    @Test
    public void testGetFourteen() {
        String result = numerals.getNumeral(14);
        assertEquals("XIV", result);
    }

    @Test
    public void testGetEightySix() {
        String result = numerals.getNumeral(86);
        assertEquals("LXXXVI", result);
    }

    @Test
    public void testGetNinetyNine() {
        String result = numerals.getNumeral(99);
        assertEquals("XCIX", result);
    }

    /********************************************************
     * Get three digit numerals
     */

    @Test
    public void testGetOneHundredAndThree() {
        String result = numerals.getNumeral(103);
        assertEquals("CIII", result);
    }

    @Test
    public void testGetNineHundredAndSeventy() {
        String result = numerals.getNumeral(970);
        assertEquals("CMLXX", result);
    }

    @Test
    public void testGetFourHundredAndNinetyOne() {
        String result = numerals.getNumeral(970);
        assertEquals("CMLXX", result);
    }

    /********************************************************
     * Get four digit numerals
     */
    @Test
    public void testGetThreeThousandFiveHundredAndSixtyEight() {
        String result = numerals.getNumeral(3568);
        assertEquals("MMMDLXVIII", result);
    }

    @Test
    public void testGetTwoThousandAndNinetyOne() {
        String result = numerals.getNumeral(2091);
        assertEquals("MMXCI", result);
    }

    @Test
    public void testGetFourThousand() {
        String result = numerals.getNumeral(4000);
        assertEquals("MMMM", result);
    }

}
