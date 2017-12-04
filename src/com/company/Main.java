package com.company;

import com.company.homework02.CalculationHelper;
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

        //2
        //számok bekérése
        System.out.println("Kérek egy egész számot: ");
        Scanner task2NewNumber1 = new Scanner(System.in);
        System.out.println("Kérek ismét egy egész számot: ");
        Scanner task2NewNumber2 = new Scanner(System.in);
        //műveleti jel bekérése
        System.out.println("Kérek egy műveleti jelet: ");
        Scanner task2NewOperation = new Scanner(System.in);
        //szám változóba mentése
        int task2Number1 = task2NewNumber1.nextInt();
        int task2Number2 = task2NewNumber2.nextInt();
        //a bevitt szöveg 1 karakterének imentése( műveleti jel lementése változóba)
        char task2Operation = task2NewOperation.next().charAt(0);;
        //a függvény meghívása a bekért adatokkal
        System.out.println(CalculatorService.calculate(task2Number1,task2Number2,task2Operation));
        System.out.println("-------------------------------");

        //3
        //a 2. feladatot is már saját értékek bekérésvel  készítettem el, ezért ezt a feladatot nem módósítottam ahhoz
        // képest csupán csak a class nevét és a változókat írtam át
        //számok bekérése
        System.out.println("Kérek egy egész számot: ");
        Scanner task3NewNumber1 = new Scanner(System.in);
        System.out.println("Kérek ismét egy egész számot: ");
        Scanner task3NewNumber2 = new Scanner(System.in);
        //műveleti jel bekérése
        System.out.println("Kérek egy műveleti jelet: ");
        Scanner task3NewOperation = new Scanner(System.in);
        //szám változóba mentése
        int task3Number1 = task3NewNumber1.nextInt();
        int task3Number2 = task3NewNumber2.nextInt();
        //a bevitt szöveg 1 karakterének imentése( műveleti jel lementése változóba)
        char task3Operation = task3NewOperation.next().charAt(0);;
        //a függvény meghívása a bekért adatokkal
        System.out.println(CalculationHelper.calculate(task3Number1,task3Number2,task3Operation));
        System.out.println("-------------------------------");

        //4
        //függvény hívás
        CalculatorService.randomNumber();

        //5
        //függvény hívás
        CalculatorService.randomNumbers();
    }
}
