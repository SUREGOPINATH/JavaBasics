package com.bridgelabz.utility;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sure Gopinath
 * create Date : 15th Oct 2020
 * Functionality : This is Utility file contains the logic
 *                 of all the codes that written in the src
 *                 folder
* */
public class Utilities {
    /**
     *
     * @param number1 -> value first number sent from called function
     * @param number2 -> value second number sent fro called function
     * @return result -> addition of first and second numbers
     *
     * */
    public int addTwoNumbers( int number1, int number2) {
        int result;
        result = number1 + number2;
        return result;
    }

    /**
     *
     * @param number1 -> value first number sent from called function
     * @param number2 -> value second number sent fro called function
     * @return result -> subtraction of first and second numbers
     *
     * */
    public int subTwoNumbers( int number1, int number2) {
        int result;
        result = number1 - number2;
        return result;
    }

    /**
     *
     * @param number1 -> value first number sent from called function
     * @param number2 -> value second number sent fro called function
     * @return result -> multiplication of first and second numbers
     *
     * */
    public int mulTwoNumbers( int number1, int number2) {
        int result;
        result = number1 * number2;
        return result;
    }

    /**
     *
     * @param number1 -> value first number sent from called function
     * @param number2 -> value second number sent fro called function
     * @return result -> division of first and second numbers
     *
     * */
    public float divTwoNumbers( int number1, int number2) {
        float result1;
        result1 = (float) number1 / number2;
        return result1;
    }

    /**
     *
     * @param number -> value first number sent from called function
     * @return result -> cube of number
     *
     * */
    public int cube( int number) {
        int result;
        result = number*number*number;
        return result;
    }

    /**
     *
     * @param number -> value first number sent from called function
     * @return result -> square of number
     *
     * */
    public int square(int number) {
        int result;
        result = number*number;
        return result;
    }

    /**
     *
     * @param number -> value of number sent from called function
     * @return  reversedNumber -> reverse of number
     *
     * */
    public int reverse( int number ) {
        int reversedNumber = 0;
        int remainder;
        while (number!=0) {
            remainder = number%10;
            reversedNumber=(reversedNumber*10)+remainder;
            number=number/10;
        }
        return reversedNumber;
    }

    /**
     *
     * @param number -> value of number sent from called function
     * @return flag -> it has either one or zero
     *                 0 -> Represents Prime Number
     *                 1 -> Represents not Prime Number
     *
     * */
    public int prime(int number) {
        int flag=0;
        for (int counter=2 ; counter<=number/2; counter++) {
            if (number%counter==0) {
                flag = 1;
                break;
            }
        }
        return flag;
    }

    public List<Integer> factors(int number) {

        List<Integer> arrayOfFactors = new ArrayList<>();
        for (int counter=2 ; counter<=number/2; counter++) {
            if (number % counter == 0) {
                arrayOfFactors.add(counter);
            }
        }
        return arrayOfFactors;
    }
    public float squareRoot(int number) {
        return (float) Math.sqrt(number);
    }
}
