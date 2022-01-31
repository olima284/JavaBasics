package com.careerdevs.moviefactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createAMovie();

        //Movie myMovie = new Movie("Sing2",(float)120f,(boolean) true,"Garth Jennings");
        //System.out.println(myMovie);
    }


    public static void createAMovie() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your favorite title :\n");
        String title = scan.nextLine();

        System.out.print("Enter your runtimeInMin Minutes:\n");
        float runtimeInMin = scan.nextFloat();

        System.out.print("let hasBeenReleased :\n");
        boolean hasBeenReleased = scan.nextBoolean();

        scan.nextLine();

        System.out.print("Enter your director name:\n");
        String director = scan.nextLine();

        Movie myMovie1= new Movie(title,runtimeInMin,hasBeenReleased,director);


    }

}

//title (String) Sing2
// runtimeInMin (float) 120 minutes
//hasBeenReleased (boolean) Monday true
//director (String)   Garth Jennings