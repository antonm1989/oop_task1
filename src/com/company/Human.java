package com.company;

public abstract class Human {
    protected boolean sex;
    protected String firstName;
    protected String lastName;
    protected float height;
    protected float weight;

    public boolean isSex() {
        return sex;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() > 0)
            this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() > 0)
            this.lastName = lastName;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if (height > 100)
            this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight > 40)
            this.weight = weight;
    }

    public Human(String firstName, String lastName, float height, float weight) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
    }

    public Human() {
        this.sex = true;
        this.firstName = "";
        this.lastName = "";
        this.height = 0;
        this.weight = 0;
    }

    @Override
    public String toString() {
        return "New human is created: {" +
                "sex=" + sex +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public abstract boolean speak(Human human);

    public abstract boolean bear(Human human);

    public abstract boolean spendTime(Human human);

}
