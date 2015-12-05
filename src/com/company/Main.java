package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a, b;
        System.out.println("Witaj w kalkulatorze!!");

        Scanner odczyt = new Scanner(System.in);
        System.out.print("Podaj pierwsza liczbe: ");
        a = odczyt.nextDouble();
        odczyt.nextLine();
        System.out.println(a);
        System.out.println("Wybierz typ dzia³ania + - * / ");
        String znak = odczyt.next();
        System.out.println("Podaj druga liczbe");
        b = odczyt.nextDouble();
        switch (znak) {
            case "+":
                System.out.println("a+b= " + (a + b));
                break;
            case "-":
                System.out.println("a-b= " + (a - b));
                break;
            case "*":
                System.out.println("a*b= " + (a * b));
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Podales zero");
                    break;
                }
            default:
                System.out.println("Nie mozna dzielic przez zero");
                break;
        }
    }
}
