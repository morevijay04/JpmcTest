package org.jpmc;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordFinderTest {

    private final WordFinder wordFinder = new WordFinder();

    @Test
    public void testFindWordWithMaximumOfLetter_occurredOnce() {
        String statement = "This is a very long sentence and I want to educate everyone in this whole crazy world";
        char inputChar = 'z';
        String expected = "crazy";
        String actual = wordFinder.findWordWithMaximumOfLetter(statement, inputChar);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindWordWithMaximumOfLetter_singleLetter() {
        String statement = "This is a very long sentence and I want to educate everyone in this whole crazy world";
        char inputChar = 'I';
        String expected = "I";
        String actual = wordFinder.findWordWithMaximumOfLetter(statement, inputChar);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindWordWithMaximumOfLetter_sameCountWords() {
        String statement = "This is a very long sentence and I want to educate everyone in this whole crazy world";
        char inputChar = 'e';
        String expected = "sentence";
        String actual = wordFinder.findWordWithMaximumOfLetter(statement, inputChar);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindWordWithMaximumOfLetter_sameLetterCountWithGreaterLengthWord() {
        String statement = "This is a very long sentence and I want to educate everyone in this whole crazy world";
        char inputChar = 'o';
        String expected = "everyone";
        String actual = wordFinder.findWordWithMaximumOfLetter(statement, inputChar);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindWordWithMaximumOfLetter_noOccurrence() {
        String statement = "This is a very long sentence and I want to educate everyone in this whole crazy world";
        char inputChar = 'x';
        String expected = "";
        String actual = wordFinder.findWordWithMaximumOfLetter(statement, inputChar);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindWordWithMaximumOfLetter_emptyString() {
        String statement = "";
        char inputChar = 'a';
        String expected = "";
        String actual = wordFinder.findWordWithMaximumOfLetter(statement, inputChar);
        assertEquals(expected, actual);
    }
}
