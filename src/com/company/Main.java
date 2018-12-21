package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Human human1 = createHuman(1);
        System.out.println();
        Human human2 = createHuman(2);
        System.out.println();
        System.out.println("созданы следующие люди:");
        System.out.println(human1);
        System.out.println(human2);
        System.out.println();
        Human child = haveRelationship(human1, human2);
        System.out.println();
        if (child != null) {
            System.out.println("образован новый человек");
            System.out.println(child.toString());
        } else System.out.println("ничего не вышло... разбежались");

    }

    public static Human createHuman(int personNumber) {
        System.out.println("Введите данные " + personNumber + "-го человека");
        Scanner scanner = new Scanner(System.in);
        System.out.println("пол (man/woman): ");
        String sex = scanner.nextLine();
//        if ((!sex.equals("man")) || (!sex.equals("woman"))) {
//            System.out.println("неверный пол, введите пол еще раз: ");
//        }
        System.out.println("имя: ");
        String firstName = scanner.nextLine();
        System.out.println("фамилия: ");
        String lastName = scanner.nextLine();
        System.out.println("рост: ");
        float height = scanner.nextFloat();
        System.out.println("вес: ");
        float weight = scanner.nextFloat();
        Human human;
        if (sex.equals("man")) {
            human = new Male();
            human.setFirstName(firstName);
            human.setLastName(lastName);
            human.setHeight(height);
            human.setWeight(weight);

        } else if (sex.equals("woman")) {
            human = new Female();
            human.setFirstName(firstName);
            human.setLastName(lastName);
            human.setHeight(height);
            human.setWeight(weight);
        } else human = null;
        return human;
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
