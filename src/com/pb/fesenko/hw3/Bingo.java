package com.pb.fesenko.hw3;

import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {
        System.out.println("Вгадайте число від 0 до 100:");
        System.out.println("Для виходу з програми введіть - 111");


        final int MAX_ATTEMPT = 101;
        int attempt = 0;
        Scanner scan = new Scanner(System.in);


        while (attempt < MAX_ATTEMPT) {
            attempt++;

            int chyslo = scan.nextInt();

            if (chyslo == 111)
            {
                System.out.println("Вихід з гри.");break;
            }

            if (chyslo != 30 && chyslo < 30)
            {
                System.out.println("Введене число менше задуманого  - " + attempt + " спроба");
            }
            if (chyslo != 30 && chyslo > 30)
            {
                System.out.println("Введене число більше задуманого - " + attempt + " спроба");
            }
            if (chyslo == 30)
            {
                System.out.println("Вітаю, ви вгадали з " +attempt+ " спроби!");
            }


            }

        }





    }










