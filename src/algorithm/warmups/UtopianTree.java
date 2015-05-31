package algorithm.warmups;

import java.util.Scanner;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of test cases");
        int numberOfTestCases = in.nextInt();
        for (int i=0;i<numberOfTestCases;i++) {
            System.out.println("Please enter the number of growth cycles");
            int numberOfGrowthCycles = in.nextInt();
            int heightOfTree = 1;
            for(int j = 0; j < numberOfGrowthCycles/2; j++){
                heightOfTree = heightOfTree * 2;
                heightOfTree = heightOfTree + 1;
            }
            if (numberOfGrowthCycles%2 != 0) heightOfTree = heightOfTree * 2;
            System.out.println(heightOfTree);
        }
    }
}
