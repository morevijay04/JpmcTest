package org.jpmc;

public class BinarySequenceFinder {
    public int getStartPositionForLongSequence(int number) {
        String binaryRep = Integer.toBinaryString(number);

        int resultSequenceStartPosition = -1;
        int resultSequenceLenght = 0;
        int tempStartPos = -1;
        int tempLength = 0;

        for (int i = 0; i < binaryRep.length(); i++) {
            if (binaryRep.charAt(i) == '1') {
                if (tempStartPos == -1) {
                    tempStartPos = i;
                }
                tempLength++;
                if (isLastCharacter(i, binaryRep)) {
                    if (resultSequenceLenght < tempLength) {
                        resultSequenceStartPosition = tempStartPos;
                        resultSequenceLenght = tempLength;
                    }
                }
            } else {
                if (resultSequenceLenght < tempLength) {
                    resultSequenceStartPosition = tempStartPos;
                    resultSequenceLenght = tempLength;
                }
                tempStartPos = i + 1;
                tempLength = 0;
            }
        }

        return resultSequenceStartPosition == -1 ? -1 : resultSequenceStartPosition + 1;
    }

    private static boolean isLastCharacter(int i, String binaryRep) {
        return i + 1 == binaryRep.length();
    }
}
