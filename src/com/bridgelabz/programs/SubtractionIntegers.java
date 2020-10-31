package com.bridgelabz.programs;

import com.bridgelabz.utility.Utilities;

import java.util.Scanner;

/**
 * @author Sure GopiNath
 * created Date : 15th Oct 2020
 * Functionality : This is SubtractionInteger program contains
 *                 values are taken from user and return with
 *                 subtraction of two numbers
 *
 * */
public class SubtractionIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int number1 = scanner.nextInt();
        System.out.println("Enter Second Number");
        int number2 = scanner.nextInt();

        Utilities utilities = new Utilities();
        int result = utilities.subTwoNumbers(number1,number2);

        System.out.println("The subtraction of two numbers is "+result);
    }
}
