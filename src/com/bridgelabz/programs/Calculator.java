package com.bridgelabz.programs;

import java.util.Scanner;
import com.bridgelabz.utility.Utilities;

/**
 * @author : Sure GopiNath
 * created Date : 15th Oct 2020
 * Functionality : This is calculator cointains all Arithmetic
 *                 operations performed based on user choice
* */
public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Choice");
        System.out.println("1.Addition \n" +
                "2.Subtraction \n" +
                "3.Multiplication \n" +
                "4.division");
        int choice = scanner.nextInt();
        System.out.println("Enter the First number");
        int number1 = scanner.nextInt();
        System.out.println("Enter the Second Number");
        int number2 = scanner.nextInt();

        int result;
        Utilities utilities = new Utilities();

        switch (choice) {
            case 1 -> {
                result = utilities.addTwoNumbers(number1, number2);
                System.out.println("Addition of "+number1+" and "+number2+" is " + result);
            }
            case 2 -> {
                result = utilities.subTwoNumbers(number1, number2);
                System.out.println("Subtraction of "+number1+" and "+number2+" is " + result);
            }
            case 3 -> {
                result = utilities.mulTwoNumbers(number1, number2);
                System.out.println("Multiplication of "+number1+" and "+number2+" is " + result);
            }
            case 4 -> {
                float result1 = utilities.divTwoNumbers(number1, number2);
                System.out.println("Multiplication of "+number1+" and "+number2+" is " + result1);
            }
        }
    }
}
