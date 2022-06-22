package com.codedifferently.assessment01.part02;

public abstract class Pet implements Animal {

    private String name;
    private Integer age;
    private PetOwner owner;
    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     */
    public Pet() {
        name = ""; // changed based on directions (see test)
        age = 0;
    }

    /**
     * @param name name of this pet
     */
    public Pet(String name) {
        this.name = name;
        age = 0;
    }


    /**
     * @param age age of this pet
     */
    public Pet(int age) {
        name = ""; // changed based on directions (see test)
        this.age = age;
    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @return name of this pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return age of this pet
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param newPetOwner the new owner of this pet
     * ensure this instance of `Pet` is added to the owner's composite `pets` list
     */
    // how to add the instance of this pet when you can't instansiate an object of an
    // abstract class and do not know whether the pet is a cat or dog
    public void setOwner(PetOwner newPetOwner) {
        this.owner = newPetOwner;
    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner() {
        return this.owner;
    }
}
