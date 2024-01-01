package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public static void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip>lastInRow) {
            System.out.println("number to skip is bigger then the last");
        } else if (lastInRow<0) {
            System.out.println("last number in row is negative");
        } else {
            int i=1;
            int skippedSum = 0;
            int countedSum = 0;

            do {
                if (i<=numberToSkip) {
                    skippedSum += i;
                } else {
                    countedSum += i;
                }
                i++;
            } while (i<=lastInRow);

            System.out.println("skipped sum is " + skippedSum);
            System.out.println("counted sum is " + countedSum);
        }
    }
    public static void main(String[] args) {
        printSumOfTwoRanges(-10, -1);
    }
}
