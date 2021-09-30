package com.siddy.romans;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestNumerals {

    /********************************************************
     * Setup tests
     */
    RomanNumerals numerals;

    @Before
    public void setup() {
        numerals = new RomanNumerals();
    }

    /********************************************************
     * Get one digit numerals
     */
    @Test
    public void testGetZero() {
        assertEquals("", numerals.getNumeral(0));
    }

    @Test
    public void testGetsOne() {
        assertEquals("I", numerals.getNumeral(1));
    }

    @Test
    public void testGetsTwo() {
        assertEquals("II", numerals.getNumeral(2));
    }

    @Test
    public void testGetsThree() {
        assertEquals("III", numerals.getNumeral(3));
    }

    @Test
    public void testGetsFour() {
        assertEquals("IV", numerals.getNumeral(4));
    }

    @Test
    public void testGetsFive() {
        assertEquals("V", numerals.getNumeral(5));
    }

    @Test
    public void testGetsSix() {
        assertEquals("VI", numerals.getNumeral(6));
    }

    @Test
    public void testGetsSeven() {
        assertEquals("VII", numerals.getNumeral(7));
    }

    @Test
    public void testGetsEight() {
        assertEquals("VIII", numerals.getNumeral(8));
    }

    @Test
    public void testGetNine() {
        assertEquals("IX", numerals.getNumeral(9));
    }


    /********************************************************
     * Get two digit numerals
     */
    @Test
    public void testGetFourteen() {
        assertEquals("XIV", numerals.getNumeral(14));
    }

    @Test
    public void testGetThirtyFive() {
        assertEquals("XXXV", numerals.getNumeral(35));
    }

    @Test
    public void testGetEightySix() {
        assertEquals("LXXXVI", numerals.getNumeral(86));
    }

    @Test
    public void testGetNinetyNine() {
        assertEquals("XCIX", numerals.getNumeral(99));
    }

    /********************************************************
     * Get three digit numerals
     */
    @Test
    public void testGetOneHundredAndThree() {
        assertEquals("CIII", numerals.getNumeral(103));
    }

    @Test
    public void testGetNineHundredAndSeventy() {
        assertEquals("CMLXX", numerals.getNumeral(970));
    }

    @Test
    public void testGetFourHundredAndNinetyOne() {
        assertEquals("CMLXX", numerals.getNumeral(970));
    }

    /********************************************************
     * Get four digit numerals
     */
    @Test
    public void testGetThreeThousandFiveHundredAndSixtyEight() {
        assertEquals("MMMDLXVIII", numerals.getNumeral(3568));
    }

    @Test
    public void testGetTwoThousandAndNinetyOne() {
        assertEquals("MMXCI", numerals.getNumeral(2091));
    }

    @Test
    public void testGetFourThousand() {
        assertEquals("MMMM", numerals.getNumeral(4000));
    }

    @Test
    public void testGetSixThousandTwoHundredAndThirteen() {
        assertEquals("MMMMMMCCXIII", numerals.getNumeral(6213));
    }

    /********************************************************
     * Get Numbers when given a numeral as a String
     */

    @Test
    public void testGetI() {
        assertEquals(1, numerals.getNumeral("I"));
    }

    @Test
    public void testGetV() {
        assertEquals(5, numerals.getNumeral("V"));
    }

    @Test
    public void testGetX() {
        assertEquals(10, numerals.getNumeral("X"));
    }

    @Test
    public void testGetL() {
        assertEquals(50, numerals.getNumeral("L"));
    }

    @Test
    public void testGetC() {
        assertEquals(100, numerals.getNumeral("C"));
    }

    @Test
    public void testGetD() {
        assertEquals(500, numerals.getNumeral("D"));
    }

    @Test
    public void testGetM() {
        assertEquals(1000, numerals.getNumeral("M"));
    }
}
