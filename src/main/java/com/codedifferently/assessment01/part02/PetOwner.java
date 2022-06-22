package com.codedifferently.assessment01.part02;

import java.util.ArrayList;
import java.util.Arrays;

public class PetOwner {
    private String name;
    private Pet[] pets;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        ArrayList<Pet> petsList = new ArrayList<>();
        if (pets == null) {
            pets = new Pet[]{pet};
            return;
        }
        petsList = new ArrayList<>(Arrays.asList(pets));
        petsList.add(pet);
        pets = petsList.toArray(pets);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        ArrayList<Pet> petsList = new ArrayList<>(Arrays.asList(pets));
        petsList.remove(pet);
        pets = petsList.toArray(pets);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return pet.getOwner().getName().equals(name);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int min = pets[0].getAge();
        for (int i = 1; i < pets.length; i++) {
            int currentPetAge = pets[i].getAge();
            if (currentPetAge < min) {
                min = currentPetAge;
            }
        }
        return min;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int max = pets[0].getAge();
        for (int i = 1; i < pets.length; i++) {
            int currentPetAge = pets[i].getAge();
            if (currentPetAge > max) {
                max = currentPetAge;
            }
        }
        return max;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        int sum = 0;
        int numberOfPets = pets.length;
        for (Pet pet : pets) {
            int currentAge = pet.getAge();
            sum += currentAge;
        }
        return (float) sum / numberOfPets;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;
    }
}
