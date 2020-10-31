package com.bridgelabz.programs;

import com.bridgelabz.utility.Utilities;
import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Utilities utilities = new Utilities();
        System.out.println("Enter a Number to find square root value");
        int number = scanner.nextInt();
        System.out.println("Square Root of " + number + " is " +utilities.squareRoot(number));
    }
}
