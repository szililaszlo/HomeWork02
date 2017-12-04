package com.company.homework02;

public class CalculatorService {

    //1
    // publikus és statikus metódus lértehozása, hogy a Main függvényből meghívható legyen
    public static boolean isItEven(int number) {
        // if feltételes elágazás ami kiértékeli, ohgy a szám párpos-e
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //2
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

    //4
    public static void randomNumber() {
        //véletlenszám generálás a képlet: (max-min+1) + (min)
        //double használata a nem egész számokért
       double number = Math.random() * 26 + 25;
       //feltételes kiíratás
        //ha a számhoz lefelé kerekített legközelebbi értékére kerekítve az megegyezik az generáltal akkor a szám egész
       if(number == Math.floor(number)) {
           System.out.println("A szám egész");
       }
       else {
           System.out.println("A szám nem egész");
       }
       // kiíratás
       System.out.println(number);
    }

    //5
    public static void randomNumbers() {
        //véletlenszám generálás a képlet: (max-min+1) + (min)
        //double használata a nem egész számokért
        double number1 = Math.random() * 51 + 100;
        System.out.println("Az első szám: " + number1);
        double number2 = Math.random() * 51 + 100;
        System.out.println("A második szám: " + number2);
        //feltételes kiíratás
        //
        if( ((number1 > number2) && (number1%2==0)) || number1<number2  && number1%2!=0) {
            System.out.println(number1);
        }
        else if ((number2 > number1) && (number2%2!=0)) {
            System.out.println(number2);
        }
        else {
            System.out.println(Math.pow(number1,number2));
        }
    }

}
