package algorithm.warmups;

import java.util.Scanner;

public class LoveLetterMystery {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of test cases");
        int numberOfTestCases = in.nextInt();

        for (int i = 0; i < numberOfTestCases; i++) {
            System.out.println("Please enter the original string value");
            String richard = in.next();
            String firstHalf = richard.substring(0, ((richard.length() - 1) / 2) + 1);
            String reversed = new StringBuilder(richard).reverse().toString();
            String secondHalf = reversed.substring(0, ((richard.length() - 1) / 2) + 1);
            int numberOfOperationsRequired = 0;
            for (int j = 0; j < firstHalf.length(); j++) {
                char firstLetter = firstHalf.charAt(j);
                char lastLetter = secondHalf.charAt(j);
                if (firstLetter > lastLetter) {
                    numberOfOperationsRequired = numberOfOperationsRequired + (firstLetter - lastLetter);
                } else if (firstLetter < lastLetter) {
                    numberOfOperationsRequired = numberOfOperationsRequired + (lastLetter - firstLetter);
                }
            }
            System.out.println(numberOfOperationsRequired);
        }
    }
}