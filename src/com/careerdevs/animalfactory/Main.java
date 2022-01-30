package com.careerdevs.animalfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        createAAnimal();
    }


    public static void createAAnimal() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your species type:\n");
        String  species = scan.nextLine();


        System.out.print("Enter your speedMPH type:\n");
        Float speedMPH = scan.nextFloat();

        System.out.print("Enter your isTerrestrial type\n");
        Boolean isTerrestrial = scan.nextBoolean();

        System.out.print("Enter your legs type:\n");
         Short legs = scan.nextShort();
        scan.nextLine();
        System.out.println("Enter your animalName type:");
        String animalName = scan.nextLine();

        Animal animal1 = new Animal(species, speedMPH, isTerrestrial, legs, animalName);
         System.out.println(animal1);

    }

}
// species (String)
//float (speedMPH)
//legs (short)
//isTerrestrial (boolean
//AnimalName (string)

