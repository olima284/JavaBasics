package com.careerdevs.animalfactory;

public class Animal {
//1)Fields
    public String species;
    public float speedMPH;
    public boolean isTerrestrial;
    public short legs;
    public String animalName;

//2)Constructor/s

    public Animal(String species, float speedMPH, Boolean isTerrestrial, short legs, String animalName) {
        this.species =species;
        this.isTerrestrial = isTerrestrial;
        this.legs = legs;
        this.speedMPH = speedMPH;
        this.animalName = animalName;

    }
 //3)Getter/Setters


// 4)other


    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", speedMPH=" + speedMPH +
                ", isTerrestrial=" + isTerrestrial +
                ", legs=" + legs +
                ", animalName='" + animalName + '\'' +
                '}';
    }
}



