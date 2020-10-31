package com.bridgelabz.programs;

import com.bridgelabz.utility.Utilities;

import java.util.Scanner;

/**
 * @author Sure GopiNath
 * created Date : 15th Oct 2020
 * Functionality : This is Addition of square program contains
 *                 values are taken from user and return with
 *                 addition and subtraction of squares of two numbers
 *
 * */
public class AdditionOfSquare {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First number");
        int number1 = scanner.nextInt();
        System.out.println("Enter Second number");
        int number2 = scanner.nextInt();

        Utilities utilities = new Utilities();

        int squareOfNumber1 = utilities.square(number1);
        int squareOfNumber2 = utilities.square(number2);

        int additionOfSquares = utilities.addTwoNumbers(squareOfNumber1,squareOfNumber2);
        int subtractionOfSquares = utilities.subTwoNumbers(squareOfNumber1,squareOfNumber2);

        System.out.println("Addition of squares of "+number1+" and "+number2+" is "+additionOfSquares);
        System.out.println("Subtraction of squares of "+number1+" and "+number2+" is "+subtractionOfSquares);
    }
}
