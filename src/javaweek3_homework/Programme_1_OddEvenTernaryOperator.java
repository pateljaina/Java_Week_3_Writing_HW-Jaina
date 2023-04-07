package javaweek3_homework;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme_1_OddEvenTernaryOperator {
    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter ");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);
        //closing scanner
        scanner.close();
    }

    //checking the number is even or odd
    public static void isItOddOrEvenNumber(int number) {
        //ternary operator is used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "odd";
        System.out.println("The" + "is" + evenOrOdd + "number");
    }
}
