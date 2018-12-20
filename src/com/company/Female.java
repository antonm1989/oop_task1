package com.company;

import java.util.Scanner;

public class Female extends Human implements bornChild {

    public Female(String firstName, String lastName, float height, float weight) {
        super(firstName, lastName, height, weight);
        this.sex = false;
    }

    public Female() {
        this.sex = false;
        this.firstName = "Sara";
        this.lastName = "Connor";
        this.height = 170;
        this.weight = 60;
    }

    @Override
    public boolean speak(Human human) {
        return false;
    }

    @Override
    public boolean bear(Human human) {
        return false;
    }

    @Override
    public boolean spendTime(Human human) {
        return false;
    }


    @Override
    public Human bornChild(Human partner) {
        boolean randomSex = ((Math.random() < 0.5) ? true : false);
        if (randomSex) {
            System.out.println("Пара сошлась, у них родился мальчик, дайте ему имя: ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            float height = (float) (partner.height + 0.1 * (this.height - partner.height));
            float weight = (float) (partner.weight + 0.1 * (this.weight - partner.weight));
            Human child = new Male(name, partner.lastName, height, weight);
            return child;
        } else {
            System.out.println("Пара сошлась, у них родилась девочка, дайте ей имя: ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            float height = (float) (this.height + 0.1 * (partner.height - this.height));
            float weight = (float) (this.weight + 0.1 * (partner.weight - this.weight));
            Human child = new Female(name, partner.lastName, height, weight);
            return child;
        }

    }


}
