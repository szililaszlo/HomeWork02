package com.company.homework02;

public class CalculatorService {

    // publikus és ttatikus metódus lértehozása, hogy a Main függvényből meghívható legyen
    public static boolean isItEven(int number) {
        // if feltételes elágazás ami kiértékeli, ohgy a szám párpos-e
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
