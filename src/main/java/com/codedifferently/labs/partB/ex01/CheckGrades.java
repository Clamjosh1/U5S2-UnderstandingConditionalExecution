package com.codedifferently.labs.partB.ex01;

import java.util.Scanner;

public class CheckGrades {

    public static String checkGrades() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What was your grade in Math?\n");
        double mathGrade = scanner.nextDouble();

        System.out.print("What was your grade in Science?\n");
        double scienceGrade = scanner.nextDouble();

        System.out.print("What was your grade in Geography?\n");
        double geographyGrade = scanner.nextDouble();

        System.out.print("What was your grade in English?\n");
        double englishGrade = scanner.nextDouble();

        System.out.print("What was your grade in Java?\n");
        double javaGrade = scanner.nextDouble();

        double total = mathGrade + scienceGrade + geographyGrade + englishGrade + javaGrade;
        double percentage = total / 5.0;

        String response = "Total grade in five subjects: " + total + "\n" +
                "My percentage: " + percentage;

        return response;
    }

    public static void main(String[] args) {
        String gradesOutput = checkGrades();
        System.out.println(gradesOutput);
    }
}
