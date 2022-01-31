package com.careerdevs.songfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    createASong();
    }

    public static void createASong() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your song title? \n Enter Song title here:" );
        String title = scan.nextLine();

        System.out.println("Enter artist name:");
        String artist = scan.nextLine();

        System.out.println("What genre of Music:");
        String genre = scan.nextLine();

        //scan.nextLine();

        System.out.println("How long is your song \n Enter In Seconds Here:");
        int seconds = scan.nextInt();

        Song song1 = new Song(title,artist,genre,seconds);
    }
}

//title (String) coding101
//artist (String) mikeMax
//genre (String) Pop
//seconds (int)  124sec
