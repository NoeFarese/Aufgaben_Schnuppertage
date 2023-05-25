package Aufgabe09;

import java.util.Scanner;

public class Aufgabe09 {
    public static void main(String[] args) {
        /*
        Kopiere den Taschenrechner hier hinein und versuche ihn so abzuändern das es nur noch einen Input braucht.
        Benutze dazu das Internet, falls du bei etwas Hilfe brauchst.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die Rechenoperation ein (z.B. 2 + 4): ");
        String eingabe = scanner.nextLine();

        String[] eingabeArray = eingabe.split(" ");

        if (eingabeArray.length != 3) {
            System.out.println("Ungültige Eingabe.");
            return;
        }

        double zahl1 = Double.parseDouble(eingabeArray[0]);
        String operator = eingabeArray[1];
        double zahl2 = Double.parseDouble(eingabeArray[2]);

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