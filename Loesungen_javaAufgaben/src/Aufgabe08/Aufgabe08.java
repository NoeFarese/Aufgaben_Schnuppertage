package Aufgabe08;

import java.util.Scanner;

public class Aufgabe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Erste Zahl: ");
        double zahl1 = scanner.nextDouble();

        System.out.print("Operator (+, -, *, /): ");
        String operator = scanner.next();

        System.out.print("Zweite Zahl: ");
        double zahl2 = scanner.nextDouble();

        double ergebnis = berechne(zahl1, operator, zahl2);

        System.out.println("Ergebnis: " + ergebnis);
    }

    public static double berechne(double zahl1, String operator, double zahl2) {
        double ergebnis = 0.0;

        switch (operator) {
            case "+":
                ergebnis = zahl1 + zahl2;
                break;
            case "-":
                ergebnis = zahl1 - zahl2;
                break;
            case "*":
                ergebnis = zahl1 * zahl2;
                break;
            case "/":
                ergebnis = zahl1 / zahl2;
                break;
            default:
                System.out.println("Ungültiger Operator.");
        }

        return ergebnis;
    }
    }