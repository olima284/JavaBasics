package com.careerdevs.asktheuser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        askVideoUser();
    }

    public static void askVideoUser() {

    Scanner scan = new Scanner(System.in);
    System.out.println("What your userName: ");
    String userName = scan.nextLine();
    System.out.println("This User Name IS " + userName);

    System.out.println("What is your age: ");
    byte userAge = scan.nextByte();
    System.out.println(userName + ":" + userAge);

    System.out.println("How many user viewed your video: ");
    int weeklyUserViews = scan.nextInt();
    System.out.println(userName +"has views:"+ weeklyUserViews + "views" );

    System.out.println("How many new users: ");
    short newWeeklyUsers = scan.nextShort();
    System.out.println(userName +"Has new views:"+ newWeeklyUsers  + "views" );
;

    System.out.println("What is your year total views: ");
    long totalViewsPerYear = scan.nextLong();
    System.out.println(userName +"total this year is :"+ totalViewsPerYear  + "views" );

    System.out.println("What is your monthly total earning: ");
    float monthlyEarning= scan.nextFloat();
    System.out.println( userName + "earned" + monthlyEarning);

    System.out.println("How much did earn this year");
    double yearlyEarningPercent= scan.nextDouble();
    System.out.println(yearlyEarningPercent );


    System.out.println(totalViewsPerYear > 2000l);
    boolean giveUserAStar = totalViewsPerYear > 2000L;
   if (giveUserAStar) {
       System.out.println( "YOU HAVE A STAR!");
   } else {
       System.out.println("YOU DO NOT GET A STAR!");
   }







    }
}

//    public String userName;
//    public byte userAge;
//    public int weeklyUserViews;
//    public short newWeeklyUsers;
//    public long totalViewsPerYear;
//    public float monthlyEarning;
//    public double yearlyEarningPercent;
//    public `boolean giveUserAStar`;