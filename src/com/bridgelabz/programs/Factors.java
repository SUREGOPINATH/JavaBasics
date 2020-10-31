package com.bridgelabz.programs;

import com.bridgelabz.utility.Utilities;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Factors {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        Utilities utilities = new Utilities();

        System.out.println("Enter a Number to find factors");
        int number = scanner.nextInt();

        List<Integer> factors = utilities.factors(number);
        System.out.println(Arrays.toString(factors.toArray()));
    }
}