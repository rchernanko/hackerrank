package algorithm.warmups;

import java.util.Scanner;

public class HalloweenParty {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of test cases");
        int numberOfTestCases = in.nextInt();

        for (int i = 0; i < numberOfTestCases; i++) {
            System.out.println("Please enter the number of cuts");
            int numberOfCuts = in.nextInt();
            int horizontal = numberOfCuts / 2;
            int vertical = (numberOfCuts%2 != 0) ? horizontal+1 : horizontal;

            System.out.println(horizontal * vertical);

        }
    }
}