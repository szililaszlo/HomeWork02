package com.company.homework02;

public class CalculatorService {

    // publikus és statikus metódus lértehozása, hogy a Main függvényből meghívható legyen
    public static boolean isItEven(int number) {
        // if feltételes elágazás ami kiértékeli, ohgy a szám párpos-e
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // publikus és statikus metódus lértehozása, hogy a Main függvényből meghívható legyen
    public static int calculate(int num1, int num2, char operation) {
        //eredmény tárolására szolgáló változó
        int result;
        // műveleti jel alapján történő művelet elvégzés
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default :
                result = num1 / num2;
                break;
        }
        //visszatérési érték
        return result;
    }

}
