package com.company;

import com.company.homework02.CalculatorService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Kérek egy egész számot: ");
        Scanner newNumber = new Scanner(System.in);
        int number = newNumber.nextInt();
        System.out.println(CalculatorService.isItEven(number));
    }
}
