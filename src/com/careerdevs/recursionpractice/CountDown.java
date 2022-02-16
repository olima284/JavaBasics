package com.careerdevs.recursionpractice;

public class CountDown {

    public static void main(String[] args) {

      iterative(5);
    }
    private static void iterative (int countDownFrom){
        //option 1
     for (int i = 0; i < countDownFrom; i++) {
     System.out.println(i);
  }
    //opt 2
//      for (int i = countDownFrom; i > 0; i--){
//      System.out.println(i);
  //  }
    //opt3
//       int i = countDownFrom;
//        while (i <= 1){
//        System.out.println(i);
//      i--;
//      }

//      //opt
//        while (countDownFrom > 0){
//               System.out.println(countDownFrom);
//                --countDownFrom
                }
}



//Define recursion


//Recursion is the technique of making a function call itself.
//This technique provides a way to break complicated problems down into simple problems which are easier to solve

//https://www.geeksforgeeks.org/recursion-in-java/
//The idea is to represent a problem in terms of one or more smaller problems,
// and add one or more base conditions that stop the recursion. For example:
//we compute factorial n if we know factorial of (n-1). The base case for factorial would be n = 0. We return 1 when n = 0.



//Intro To Recursion
//Write a function that recursively finds the sum of the first n natural numbers.
//https://edabit.com/challenge/nMbE2g7MB5yFcTzoB
//   public class Challenge {
//   public static int sum(int n) {
//        if(n==0)
//            return 0;
//        else if(n==1)
//            return 1;
//        else
//            return n+sum(n-1);

//    }



