package com.pb.fesenko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть будь-яке число:");
        int number = scan.nextInt();
        if (number<=14) {
            System.out.println("Ваше число в межах [0-14]");
        }else if (number > 100) {
            System.out.println("Ваше число не попадає в жоден діапазон");
        }else if (number>=15 && number<=35) {
            System.out.println("Ваше число в межах [15-35]");
        }else if (number>=36 && number<=50) {
            System.out.println("Ваше число в межах [36-50]");
        }else if (number>=51 && number<=100) {
            System.out.println("Ваше число в межах [51-100]");

        }

    }
}
