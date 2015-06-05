package algorithm.warmups;

import java.util.Scanner;

public class LoveLetterMystery {

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        System.out.println("Please enter the number of test cases");
//        int numberOfTestCases = in.nextInt();
//        for (int i = 0; i < numberOfTestCases; i++) {
//            System.out.println("Please enter the number of growth cycles");
//            int numberOfGrowthCycles = in.nextInt();
//        }

        String richard = "abcd";
//        StringBuilder richard = new StringBuilder("abcd");

        String firstHalf = richard.substring(0, ((richard.length()-1)/2)+1);

        String reversed = new StringBuilder(richard).reverse().toString();

        String secondHalf = reversed.substring(0, ((richard.length()-1)/2)+1);

//        System.out.println(firstHalf);
//        System.out.println(secondHalf);

        int numberOfOperationsRequired = 0;

        for(int i = 0; i < firstHalf.length(); i++){

            char firstLetter = firstHalf.charAt(i);
            char lastLetter = secondHalf.charAt(i);

            if(firstLetter > lastLetter){
                numberOfOperationsRequired = numberOfOperationsRequired + (firstLetter - lastLetter);
            }
            firstLetter - lastLetter = 0

        }


        firstHalf.length();




//        System.out.println(richard.length());
//
//
//
//
//        int firstLetter = richard.charAt(0);
//
//        System.out.println(richard.charAt(richard.length()-1));




    }
}