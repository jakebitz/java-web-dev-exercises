package org.launchcode.java.demos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class arrayPractice {
    public static void main(String[] args) {
        int[] genArray = {1,1,2,3,5,8};

        for (int integer: genArray){
            System.out.println(genArray);
        }
        for(int i = 0; i < genArray.length; i++){
            if(genArray[i] % 2 == 0){
                continue;
            }
            System.out.println(genArray[i]);
        }
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse. ";

        String[] words = phrase.split("");
        System.out.println(Arrays.toString(words));

        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));

        ArrayList<Integer> intsList = new ArrayList<>();
                Scanner input;
        input = new Scanner(System.in);
        for(int i = 0; i < 9; i++) {
            System.out.println("Enter a word length: ");
            int numChars = input.nextInt();
            intsList.add(numChars);
        }
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
}