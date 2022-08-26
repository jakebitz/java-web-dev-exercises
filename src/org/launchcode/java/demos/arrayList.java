package org.launchcode.java.demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> intsList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse. ";
String newPhrase = phrase.replaceAll("\\."," ");
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(newPhrase.split("")));
        Scanner input;
        input = new Scanner(System.in);

            System.out.println("Enter a word length: ");
            int numChars = input.nextInt();
            intsList.add(numChars);

        System.out.println(sumEven(intsList));
    }
    public static int sumEven(ArrayList<Integer> arr) {

        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
    public static void printFiveLetterWords(ArrayList<String> arr){
        for (String word: arr){
            if(word.length() == 5){
                System.out.println(word);
            }
        }
    }
}

