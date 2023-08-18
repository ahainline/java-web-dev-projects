package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studentName;
        int studentId;

        do {
            System.out.println("Student: ");
            studentName = input.nextLine();

            if (!studentName.equals("")) {
                System.out.println("Student ID: ");
                studentId = input.nextInt();
                students.put(studentId, studentName);

                input.nextLine();
            }
        } while(!studentName.equals(""));

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }

    }
}
