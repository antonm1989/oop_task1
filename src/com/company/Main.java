package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите данные первого человека.");
        Human human1 = createHuman();
        System.out.println("Введите данные второго человека.");
        Human human2 = createHuman();
        Human child = haveRelationship(human1, human2);
        if (child != null) {
            System.out.println(child.toString());
        } else System.out.println("ничего не вышло... разбежались");

    }

    public static Human createHuman() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("пол (м - 1, ж - 0): ");
        int sex = scanner.nextInt();
        System.out.print("имя: ");
        String firstName = scanner.nextLine();
        System.out.print("фамилия: ");
        String lastName = scanner.nextLine();
        System.out.print("рост: ");
        float height = scanner.nextFloat();
        System.out.print("вес: ");
        float weight = scanner.nextFloat();

        if (sex==1) {
            Human human = new Male();
            human.setFirstName(firstName);
            human.setLastName(lastName);
            human.setHeight(height);
            human.setWeight(weight);
            return human;
        } else {
            Human human = new Female();
            human.setFirstName(firstName);
            human.setLastName(lastName);
            human.setHeight(height);
            human.setWeight(weight);
            return human;
        }
    }

    public static Human haveRelationship(Human partner1, Human partner2) {
        if ((partner1.speak(partner2)) && (partner1.bear(partner2)) && (partner1.spendTime(partner2))
                && (partner1.sex != partner2.sex)) {
            if (partner1 instanceof Female)
                return ((Female) partner1).bornChild(partner2);
            else return ((Female) partner2).bornChild(partner1);
        } else return null;
    }
}
