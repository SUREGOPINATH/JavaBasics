package com.bridgelabz.programs;

import java.util.Scanner;
import com.bridgelabz.utility.Utilities;

/**
 * @author Sure GopiNath
 * created Date : 15th Oct 2020
 * Functionality : This is Square and cube program contains
 *                 value is taken from user and return with
 *                 square and cube of number
 *
 * */
class SquareAndCubes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to get square and cube of that number");
        int number = scanner.nextInt();

        Utilities utilities = new Utilities();

        int square = utilities.square(number);
        int cube = utilities.cube(number);
        System.out.println("square of "+number+" is "+square);
        System.out.println("Cube of "+number+" is "+cube);
    }
}
