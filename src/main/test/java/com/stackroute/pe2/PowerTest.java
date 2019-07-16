package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {
    Power power;

    @Before
    public void setUp() {
        this.power = new Power();
    }

    @After
    public void tearDown() {
        this.power = null;
    }

    @Test
    public void givenPowerOfFourShouldReturnPowerOfFour() {
        int actualResult = power.powerChecker(64);
        assertEquals("The entered number is power of 4", actualResult);
    }

    @Test
    public void givenNotPowerOfFourShouldReturnNotPowerOfFour() {
        int actualResult = power.powerChecker(80);
        assertEquals("The entered number is not power of 4", actualResult);
    }

    @Test
    public void givenNumberLessThanFourShouldReturnErrorMessage() {
        int actualResult = power.powerChecker(-4);
        assertEquals("Error: Please enter number greater than 4", actualResult);
    }

    @Test
    public void givenStringshouldReturnErrorMessage() {
        String  actualResult = power.powerChecker("String");
        assertEquals("Error: Please enter number not string", actualResult);
    }

    @Test
    public void givenNullshouldReturnErrorMessage() {
        String  actualResult = power.powerChecker("String");
        assertNull("Error: Please enter a number", actualResult);
    }
}