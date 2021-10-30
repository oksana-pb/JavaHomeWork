package com.pb.fesenko.hw4;

import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CapitalLetter {
    public static void main(String[] args)
    {
        getCapitalLetter();
    }
        public static void getCapitalLetter()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть фразу: ");
        String tekst = scan.nextLine();

        String[] word = tekst.split("\\s+");
        String newtekst = "  ";
        for (int i = 0; i < word.length; i++) {
            newtekst = newtekst + word[i].substring(0, 1).toUpperCase() + word[i].substring(1).toLowerCase() + " ";
        }
        System.out.println(newtekst.trim());



    }
}











