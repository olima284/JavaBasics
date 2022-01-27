package com.careerdevs.animalfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String species;
       // Animal animal1 = new Animal( "Bird", (float) 200,  true, (short) 2, "Speedy the bird");
       // System.out.println(animal1);
        createAAnimal();
    }


    public static void createAAnimal() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your species type\nString: \n");
        String  species;


        System.out.print("Enter your speedMPH type\nNum: \n");
        float speedMPH;

        System.out.print("Enter your isTerrestrial type\nTrue: \n");
        boolean isTerrestrial;

        System.out.print("Enter your legs type\nNum: \n");
        short legs;

        System.out.print("Enter your AnimalName type\nString: \n");
        String AnimalName;

    }

}
// species (String)
//float (speedMPH)
//legs (short)
//isTerrestrial (boolean
//AnimalName (string)

