package com.careerdevs.asktheuser;

import java.net.PortUnreachableException;
import java.security.PublicKey;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String userName = name();
        byte userAge = age();
        int weeklyUserViews = weeklyViews();
        short newWeeklyUsers = newUsers();
        long totalViewsPerYear = perYear();
        float monthlyEarning = monthlyMoney();
        double yearlyEarningPercent = yearlyPercent();
        star(totalViewsPerYear);

    }

    public static String name() {
        System.out.println("What your userName: ");
        String userName = scan.nextLine();
        System.out.println("This User Name IS " + userName);
        return userName;

    }

    public static byte age() {
        System.out.println("What is your age: ");
        byte userAge = scan.nextByte();
        System.out.println("Your age is: " + userAge);
        return userAge;
    }

    public static int weeklyViews() {
        System.out.println("How many user viewed your video: ");
        int weeklyUserViews = scan.nextInt();
        System.out.println("Your weekly views are: " + weeklyUserViews);
        return weeklyUserViews;

    }


    public static short newUsers() {
        System.out.println("How many new users: ");
        short newWeeklyUsers = scan.nextShort();
        System.out.println("Has new users: " + newWeeklyUsers);
        return newWeeklyUsers;
    }

    public static long perYear() {
        System.out.println("What is your year total views: ");
        long totalViewsPerYear = scan.nextLong();
        System.out.println( "total this year is :" + totalViewsPerYear + "views");
        return totalViewsPerYear;
    }

    public static float monthlyMoney() {
        System.out.println("What is your monthly total earning: ");
        float monthlyEarning = scan.nextFloat();
        System.out.println("earned" + monthlyEarning);
        return monthlyEarning;
    }

    public static double yearlyPercent() {
        System.out.println("How much did earn this year");
        double yearlyEarningPercent = scan.nextDouble();
        System.out.println(yearlyEarningPercent);
        return yearlyEarningPercent;
    }

    public static void star(long totalViewsPerYear) {
        System.out.println(totalViewsPerYear > 2000l);
        boolean giveUserAStar = totalViewsPerYear > 2000L;
        if (giveUserAStar) {
            System.out.println("YOU HAVE A STAR!");
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