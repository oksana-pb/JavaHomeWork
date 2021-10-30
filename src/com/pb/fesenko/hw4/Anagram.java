package com.pb.fesenko.hw4;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        testAnagram();
    }

    public static void testAnagram() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть першу фразу:");
        String tekst1 = scan.nextLine();
        System.out.println("Введіть другу фразу:");
        String tekst2 = scan.nextLine();

        String tekst11 = tekst1.toLowerCase();
        String tekst22 = tekst2.toLowerCase();


        if (tekst11.equals("") || tekst22.equals("")) {
            return;
        }
        char[] arrayTekst11 = tekst11.toCharArray();
        char[] arrayTekst22 = tekst22.toCharArray();

        Arrays.sort(arrayTekst11);
        Arrays.sort(arrayTekst22);

        if (Arrays.equals(arrayTekst11, arrayTekst22)) {
            System.out.println("Є анаграмою");
        } else {
            System.out.println("Не є анаграмою");
        }

    }
}
