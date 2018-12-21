package com.company;

public class Male extends Human {
    public Male(String firstName, String lastName, float height, float weight) {
        super(firstName, lastName, height, weight);
        this.sex = true;
    }

    public Male() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.sex = true;
        this.height = 180;
        this.weight = 90;
    }
}
