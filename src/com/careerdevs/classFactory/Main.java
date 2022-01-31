package com.careerdevs.classFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createAClass();

    }
    public static void createAClass(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter student name here:");
        String studentName = scan.nextLine();

        System.out.println("Enter field of study here: ");
        String fieldOfStudy = scan.nextLine();

        System.out.println("Enter gpa here:");
        Boolean gpaIsEligible = scan.nextBoolean();

        System.out.println(" Enter Monthly income here: \n");
        float roundMonthlyIncome = scan.nextFloat();

        scan.nextLine();

        System.out.println("Enter Grade A-D from last term here: \n");
        char lastGradeInSubject = scan.nextLine().charAt(0);

    Class class1= new Class(studentName, fieldOfStudy,gpaIsEligible,roundMonthlyIncome,lastGradeInSubject);
        System.out.println(class1);


    }
}




//Student Name:String
//FieldsOfStudy:String
//GpaIsEligible:boolean 3.0 || <
//roundMonthlyIncome : float
//lastGradeInSubject : char 'A,B,C,D'
