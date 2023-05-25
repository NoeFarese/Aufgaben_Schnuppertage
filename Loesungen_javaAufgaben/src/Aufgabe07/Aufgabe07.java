package Aufgabe07;

import java.util.Random;
import java.util.Scanner;

public class Aufgabe07 {
    public static void main(String[] args) {
        System.out.println("Es wurde eine Zahl zwischen 1 bis 100 generiert. Versuceh sie zu erraten. Du hast 5 versuche");
        Random random1 = new Random();
        int randomZahl = random1.nextInt(100);
        System.out.println(randomZahl);

        for (int i = 0; i < 5; i++) {
            Scanner input1 = new Scanner(System.in);
            int userValue = input1.nextInt();

            if (userValue > randomZahl) {
                System.out.println("Die Zahl die gesucht wird ist kleiner!");
            }

            if (userValue < randomZahl) {
                System.out.println("Die Zahl die gesucht wird ist grösser!");
            }

            if (userValue < 1) {
                System.out.println("Bitte wählen Sie eine Zahl zwischen 1-100");
            }

            if (userValue > 100) {
                System.out.println("Bitte wählen Sie eine Zahl zwischen 1-100");
            }

            if (userValue == randomZahl) {
                System.out.println("Du hast die richtige Zahl erraten!");
                System.exit(0);
            }
            int versuche = 4 - i;
            System.out.println("Anzahl Versuche übrig: " + versuche);
        }
    }
}
