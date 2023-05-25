package Aufgabe06;

import java.util.Random;

public class Aufgabe06 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i <= 10; i++) {
            int randomZahl = random.nextInt(100);
            System.out.println(randomZahl);
        }
    }
}
