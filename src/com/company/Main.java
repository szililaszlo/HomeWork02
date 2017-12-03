package com.company;

import com.company.homework02.CalculatorService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //szám bekérése
        System.out.println("Kérek egy egész számot: ");
        Scanner newNumber = new Scanner(System.in);
        //szám változóba mentése
        int number = newNumber.nextInt();
        //a függvény meghívása a bekért számmal
        System.out.println(CalculatorService.isItEven(number));
        System.out.println("-------------------------------");
    }
}
