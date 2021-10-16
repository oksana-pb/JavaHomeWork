package com.pb.fesenko.hw2;

import javax.xml.transform.Result;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Введіть значення operand1");
        int operand1 = scan.nextInt();

        System.out.print("Введіть значення operand2");
        int operand2 = scan.nextInt();

        System.out.print("Введіть знак операції(+-*/):");
        scan.nextLine();
        String sign = scan.nextLine();
        System.out.println("operand1 = " + operand1 + " operand2 = " + operand2 + "sign = " + sign);



        switch (sign) {
            case "+":
                System.out.println(+(operand1 + operand2));
                break;
            case "-":
                System.out.println(+(operand1 - operand2));
                break;
            case "*":
                System.out.println(+(operand1 * operand2));
                break;
            case "/": {
                if (operand2 == 0)
                    System.out.println("Ділити на нуль не можна");
            }
            {if (operand2 != 0)
                System.out.println(+(operand1 / operand2));
        }

                break;
        }
    }
}