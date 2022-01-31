package com.careerdevs.classFactory;

public class Class {
    public String studentName;
    public String fieldOfStudy;
    public boolean gpaIsEligible;
    public float roundMonthlyIncome;
    public char lastGradeInSubject;

    public Class(String studentName, String fieldOfStudy, Boolean gpaIsEligible, float roundMonthlyIncome, char lastGradeInSubject ) {
        this.studentName = studentName;
        this.fieldOfStudy = fieldOfStudy;
        this.gpaIsEligible = gpaIsEligible;
        this.roundMonthlyIncome = roundMonthlyIncome;
        this.lastGradeInSubject = lastGradeInSubject;
    }

    @Override
    public String toString() {
        return "Class{" +
                "studentName='" + studentName + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", gpaIsEligible=" + gpaIsEligible +
                ", roundMonthlyIncome=" + roundMonthlyIncome +
                ", lastGradeInSubject=" + lastGradeInSubject +
                '}';
    }
}





//studentName:String
//fieldOfStudy:String
//gpaIsEligible:boolean 3.0f || <
//roundMonthlyIncome : float
//lastGradeInSubject : char 'A,B,C,D'
