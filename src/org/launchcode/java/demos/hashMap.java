package org.launchcode.java.demos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> classRoster = new HashMap<>();
        String newStudent;
        Integer newId;
        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();
            if(!newStudent.equals("")){
                System.out.println("ID: ");
                newId = input.nextInt();
                classRoster.put(newId, newStudent);
                input.nextLine();
            }


        } while(!newStudent.equals(""));
        System.out.println("\nClass roster: ");
        for(Map.Entry<Integer, String> student: classRoster.entrySet()){
            System.out.println(student.getValue() + "ID's: " + student.getKey());
        }
    }
}
