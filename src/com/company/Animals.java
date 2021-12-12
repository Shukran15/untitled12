package com.company;

import java.io.Serializable;

public class Animals implements Serializable {
    private String animal;
    private String name;
    private int level;

    public Animals (String animal, String name, int level){
        this.animal = animal;
        this.name = name;
        this.level = level;
    }
    public String getAnimal() {
        return animal;
    }
    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }

    public String toString() {

        return animal + ": " + name + ", " + level;
    }
}

