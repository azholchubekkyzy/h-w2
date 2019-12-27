package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String name = "Akylai";
        int age = 30;
        int temperature = 35;

        if (age > 20 && age < 45) {

            if (temperature > 30 || temperature < -20) {

                System.out.println( name+  " может идти гулять");
            } else {
                System.out.println( name+ " сидит дома");
            }

        } else {
            System.out.println( name+ " сидит дома");
        }
        String name2 = "Жолчубек";

        int age2 = 18;
        int temperature2 = 20;

        if (age2 < 20 && temperature2 > 0 && temperature2 < 28) {

            System.out.println( name2+ " может гулять");

        } else {
            System.out.println( name2+ " не гуляет");
        }
        String name3 = "Кызы";
        int age3 = 50;
        int temperature3 = -15;

        if (age3 > 45 && temperature3 < -10 && temperature3 < 25) {

            System.out.println( name3+ " сидит дома");

        } else {
            System.out.println( name3+ " работает");

        }
    }


}

