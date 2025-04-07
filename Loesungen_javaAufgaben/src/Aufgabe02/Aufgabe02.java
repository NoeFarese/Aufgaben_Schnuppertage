package Aufgabe02;

import java.util.Scanner;

public class Aufgabe02 {
    public static void main(String[] args) {
        // Erstelle einen Scanner und frage nach der Lieblingsfarbe (Zeichenkette -> String).
        // Gib diese danach aus.

        System.out.println("Gib deine Lieblingsfarbe ein: ");

        Scanner scanner = new Scanner(System.in);
        String lieblingsFarbe = scanner.nextLine();

        System.out.println("Lieblingsfarbe: " + lieblingsFarbe);
    }
}
