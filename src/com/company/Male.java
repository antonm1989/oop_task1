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

    @Override
    public boolean speak(Human partner) {
        if (partner.sex) {
            return ((Math.random() < 0.5) ? true : false);
        } else return true;
    }

    @Override
    public boolean bear(Human partner) {
        if (partner.sex) {
            return ((Math.random() < 0.056) ? true : false);
        } else return ((Math.random() < 0.7) ? true : false);
    }

    @Override
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

//    @Override
//    public Human haveRelationship(Human partner) {
//        if ((speak(partner)) && (bear(partner)) && (spendTime(partner))) {
//            if (this.sex == partner.sex) return null;
//            else return partner.born(this);
//        }
//        else return null;
//    }
}
