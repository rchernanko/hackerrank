/*

[29/06/2015 15:12:13] Jay Gehlot: Your Java challenge is (should you wish to accept it)

Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
[29/06/2015 15:12:30] Jay Gehlot: using Arrays only! :D


*/

package jay_challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String wordInputted = input.next();

        ArrayList<Character> letters = new ArrayList<Character>();

//        System.out.println(wordInputted.charAt(0));
//        System.out.println(wordInputted.charAt(1));

        for(int i = 0; i < wordInputted.length(); i++) {
            Character letter = wordInputted.charAt(i);
            letters.add(i, letter);
        }

        System.out.print(letters.get(0));
        System.out.print(letters.get(1));


        if(wordInputted.length() >=5) {

            System.out.print(letters.get(4));
        }

        if(wordInputted.length() >=6) {

            System.out.print(letters.get(5));

        }

        if(wordInputted.length() >=9) {

            System.out.print(letters.get(8));

        }

        if(wordInputted.length() >=10){

            System.out.print(letters.get(9));

        }

        //Get the word
        //Find out how many letters are in the word
        //Put each letter into an index
        //Call the relevant indexes
        //print the index values





    }
}
