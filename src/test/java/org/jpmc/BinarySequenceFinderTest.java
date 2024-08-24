package org.jpmc;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySequenceFinderTest {

    private final BinarySequenceFinder binarySequenceFinder = new BinarySequenceFinder();

    @Test
    public void testGetStartPositionForLongSequence_case1() {
        int input = 156;
        System.out.println("Binary value for " + input + " is " + Integer.toBinaryString(input));
        System.out.println("Binary value for " + input + " is " + Integer.toBinaryString(input)); // Binary vaule: 10011100
        int expected = 4;
        int actual = binarySequenceFinder.getStartPositionForLongSequence(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStartPositionForLongSequence_case2() {
        int input = 88;
        System.out.println("Binary value for " + input + " is " + Integer.toBinaryString(input)); // Binary vaule: 1011000
        int expected = 3;
        int actual = binarySequenceFinder.getStartPositionForLongSequence(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStartPositionForLongSequence_OnlyOne() {
        int input = 1;
        System.out.println("Binary value for " + input + " is " + Integer.toBinaryString(input)); // Binary vaule: 01
        int expected = 1;
        int actual = binarySequenceFinder.getStartPositionForLongSequence(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStartPositionForLongSequence_zeroOnes() {
        int input = 0;
        System.out.println("Binary value for " + input + " is " + Integer.toBinaryString(input)); // Binary vaule: 0
        int expected = -1;
        int actual = binarySequenceFinder.getStartPositionForLongSequence(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStartPositionForLongSequence_allOnes() {
        int input = 15;
        System.out.println("Binary value for " + input + " is " + Integer.toBinaryString(input)); // Binary vaule: 1111
        int expected = 1;
        int actual = binarySequenceFinder.getStartPositionForLongSequence(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStartPositionForLongSequence_multipleSequencesOfSameLength() {
        int input = 7069;
        System.out.println("Binary value for " + input + " is " + Integer.toBinaryString(input)); // Binary vaule: 1101110011101
        int expected = 4;
        int actual = binarySequenceFinder.getStartPositionForLongSequence(input);
        assertEquals(expected, actual);
    }
}
