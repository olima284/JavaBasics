package com.careerdevs.asktheuser;

import java.util.Scanner;

public class UserInterface {
    public String userName;
    public byte userAge;
    public int weeklyUserViews;
    short newWeeklyUsers;
    public long totalViewsPerYear;
    public float monthlyEarning;
    public double yearlyEarningPercent;
    public boolean giveUserAStar;


    public UserInterface(String userName, byte userAge, int  weeklyUserViews, short newWeeklyUsers,  long totalViewsPerYear, float monthlyEarning, double yearlyEarningPercent, boolean giveUserAStar) {
     this.userName = userName;
     this.userAge = userAge;
     this.weeklyUserViews = weeklyUserViews;
     this.newWeeklyUsers =  newWeeklyUsers;
     this.totalViewsPerYear = totalViewsPerYear;
     this.monthlyEarning = monthlyEarning;
     this.yearlyEarningPercent = yearlyEarningPercent;
     this.giveUserAStar = giveUserAStar;
    }

    @Override
    public String toString() {
        return "UserInterface{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", weeklyUserViews=" + weeklyUserViews +
                ", newWeeklyUsers=" + newWeeklyUsers +
                ", totalViewsPerYear=" + totalViewsPerYear +
                ", monthlyEarning=" + monthlyEarning +
                ", yearlyEarningPercent=" + yearlyEarningPercent +
                ", giveUserAStar=" + giveUserAStar +
                '}';
    }
}

    //enter name
    //enter age
    //max < 2000
    //min > 200
    //named person enter views total (anything more min earns star)
    //yearly earning
    //boolean = true if max || min && !over(age of 18)



//notes
//main/enter(PSVM/enter):mainClass
//(sout):(Systems.out.println())

// Scanner scanner = new Scanner(System.in);
//String--> scanner.nextString()
//        System.out.println("name: ");
//        String userName = scanner.nextLine();
//        System.out.println("Hello " + userName);
//Byte --> scanner.nextByte();
//        System.out.println("age: ");
//        Byte userAge = scanner.nextByte();
//        System.out.println("How old are you " + userAge);
//
//int --> scanner.nextInt();
// int userWeeklyViews = 4000
// scanner.nextInt();
//System.out.println("new users per week" + userWeeklyViews );

////float --> scanner.nextFloat();
//        System.out.print("Enter the amount: ");
//        float users = scanner.nextFloat();
//        System.out.println("You are getting close " + users );
//long --> scanner.nextLong();
//        long usersInTotal = 777_85_099L;
//        System.out.println("You are Gold level With  " + usersInTotal + " users");
//double --> scanner.nextDouble();
//        double balance;
//        System.out.println("Enter the Total Balance: ");
//        balance = scanner.nextDouble();
////
//boolean --> scanner.nextBoolean();
//        System.out.println("Are you over 30?-");
//        boolean bn = scanner.nextBoolean();
//        if(bn == true) {
//            System.out.println( "You are over 30");
//        }
