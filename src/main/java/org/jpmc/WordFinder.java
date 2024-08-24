package org.jpmc;

public class WordFinder {

    public String findWordWithMaximumOfLetter(String inputString, char letter) {
        int resultLetterCount = 0;
        String result = "";
        for (String word : inputString.split(" ")) {
            int count = 0;
            for (Character c : word.toCharArray()) {
                if (c == letter) {
                    count++;
                }
            }
            if (count > 0 && (resultLetterCount < count || isSameCountWithGreaterLength(word, resultLetterCount, count, result))) {
                result = word;
                resultLetterCount = count;
            }
        }

        return result;
    }


    private static boolean isSameCountWithGreaterLength(String word, int resultLetterCount, int count, String result) {
        return resultLetterCount == count && word.length() > result.length();
    }
}
