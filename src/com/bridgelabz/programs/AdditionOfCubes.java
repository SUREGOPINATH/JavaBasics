package com.bridgelabz.programs;

import com.bridgelabz.utility.Utilities;

import java.util.Scanner;

/**
 * @author Sure GopiNath
 * created Date : 15th Oct 2020
 * Functionality : This is Addition of Cubes program contains
 *                 values are taken from user and return with
 *                 addition and subtraction of cubes of two numbers
 *
 * */
public class AdditionOfCubes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First number");
        int number1 = scanner.nextInt();
        System.out.println("Enter Second number");
        int number2 = scanner.nextInt();

        Utilities utilities = new Utilities();

        int cubeOfNumber1 = utilities.cube(number1);
        int cubeOfNumber2 = utilities.cube(number2);

        int additionOfCubes = utilities.addTwoNumbers(cubeOfNumber1,cubeOfNumber2);
        int subtractionOfCubes = utilities.subTwoNumbers(cubeOfNumber1,cubeOfNumber2);

        System.out.println("Addition of cubes of "+number1+" and "+number2+" is "+additionOfCubes);
        System.out.println("Subtraction of cubes of "+number1+" and "+number2+" is "+subtractionOfCubes);
    }
}
