package com.company;

import java.util.Scanner;

public abstract class Human {
    protected boolean sex;
    protected String firstName;
    protected String lastName;
    protected float height;
    protected float weight;

    public void setFirstName(String firstName) {
        if (firstName.length() > 0)
            this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() > 0)
            this.lastName = lastName;
    }

    public void setHeight(float height) {
        if (height > 100)
            this.height = height;
        else {
            System.out.println("некорректный рост (<100)! повторите ввод роста: ");
            Scanner scanner = new Scanner(System.in);
            setHeight(scanner.nextFloat());
        }
    }

    public void setWeight(float weight) {
        if (weight > 40)
            this.weight = weight;
        else {
            System.out.println("некорректный вес (<40)! повторите ввод роста: ");
            Scanner scanner = new Scanner(System.in);
            setWeight(scanner.nextFloat());
        }
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
        String humanSex;
        if (this.sex) humanSex = "мужской";
        else humanSex = "женский";
        return "человек: {" +
                "пол = " + humanSex +
                ", имя = '" + firstName + '\'' +
                ", фамилия = '" + lastName + '\'' +
                ", рост = " + height +
                ", вес = " + weight +
                '}';
    }

    public boolean speak(Human partner) {
        if ((partner.sex) && (this.sex)) return ((Math.random() < 0.5) ? true : false);
        else return true;
    }

    public boolean bear(Human partner) {
        if ((partner.sex) && (this.sex)) return ((Math.random() < 0.056) ? true : false);
        if ((!partner.sex) && (!this.sex)) return ((Math.random() < 0.005) ? true : false);
        else return ((Math.random() < 0.7) ? true : false);
    }

    public boolean spendTime(Human partner) {
        double delta;
        double diff = this.height - partner.height;
        if (diff >= 0) {
            delta = 1 - (partner.height / this.height);
        } else {
            delta = 1 - (this.height / partner.height);
        }
        if (delta > 0.1) {
            return ((Math.random() < 0.85) ? true : false);
        } else return ((Math.random() < 0.95) ? true : false);
    }

}
