package com.pb.fesenko.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть числа:");
        int[] array = new int[10];
        int x = array.length;
        int sum = 0;
        int pos = 0;


        {
            for (int i = 0; i < array.length; i++) {

                array[i] = scan.nextInt();

            }
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            System.out.println("Сума всіх чисел: " + sum);


            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0) {
                    pos++;

                }
            }
            System.out.println("Кількість чисел більше 0: " + pos);


            System.out.println("Відсортовано від меншого до більшого:");

            int povtor = 0;
            boolean zamina = true;
            while (zamina)
            {
                zamina = false;
                for (int i = 0; i < array.length - 1-povtor; i++) {
                    if (array[i] > array[i + 1]) {
                        int tmp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = tmp;
                        zamina = true;
                    }
                }
                povtor++;
            }
            for (int i: array)
                System.out.println(i);

        }

    }
}













