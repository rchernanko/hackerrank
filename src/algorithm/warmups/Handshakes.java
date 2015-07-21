/*

From Hackerrank website:

Problem Statement

At the annual meeting of Board of Directors of Acme Inc, every one starts shaking hands with everyone else in the room. Given the fact that any two persons shake hand exactly once, Can you tell the total count of handshakes?

Input Format
The first line contains the number of test cases T, T lines follow.
Each line then contains an integer N, the total number of Board of Directors of Acme.

Output Format

Print the number of handshakes for each test-case in a new line.

Constraints

1 <= T <= 1000
0 < N < 106

Sample Input

2
1
2

Sample Output

0
1

Explanation

Case 1 : The lonely board member shakes no hands, hence 0.
Case 2 : There are 2 board members, 1 handshake takes place.


 */

package algorithm.warmups;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Handshakes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of test cases");
        int numberOfTestCases = in.nextInt();
        for (int i = 0; i < numberOfTestCases; i++) {
            int numberOfPeople = in.nextInt();
            List<Integer> people = new ArrayList<Integer>();
            for (int j = 0; j != numberOfPeople; j++) {
                if (j != 0)
                    people.add(j);
            }
            int numberOfHandshakes = 0;
            for (Integer person : people) {
                List<Integer> otherPeople = people.subList(people.indexOf(person), people.size() - 1);
                numberOfHandshakes = numberOfHandshakes + otherPeople.size();
            }
            System.out.println(numberOfHandshakes);
        }
    }
}