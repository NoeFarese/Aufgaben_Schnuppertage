package Aufgabe10;

import java.util.Scanner;

public class Aufgabe10 {
    public static void main(String[] args) {
           /*
        Schreibe ein Programm, das einen Tannenbaum auf den Bildschirm zeichnet. Der Benutzer soll eingeben können: wie hoch die Krone gezeichnet werden soll und wie breit und wie hoch der Stamm sein soll.
        Das Programm soll ungefähr so aussehen.


                Wie hoch soll die Tannenbaum Krone werden?
                10
                Wie breit soll der Stamm werden?
                10
                Wie hoch soll der Stamm werden?
                7
                         *
                        ***
                       *****
                      *******
                     *********
                    ***********
                   *************
                  ***************
                 *****************
                *******************
                    **********
                    **********
                    **********
                    **********
                    **********
                    **********
                    **********

          Als Zusatz kannst du alles noch mit Methoden lösen.
          Es sollte die Methoden baumStamm, baumKrone und eine Zeile geben.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wie hoch soll die Tannenbaum Krone werden? ");
        int kroneHoehe = scanner.nextInt();

        System.out.print("Wie breit soll der Stamm werden? ");
        int stammBreite = scanner.nextInt();

        System.out.print("Wie hoch soll der Stamm werden? ");
        int stammHoehe = scanner.nextInt();

        zeichneTannenbaum(kroneHoehe, stammBreite, stammHoehe);
    }

    public static void zeichneTannenbaum(int kroneHoehe, int stammBreite, int stammHoehe) {
        baumKrone(kroneHoehe);
        baumStamm(stammBreite, stammHoehe);
    }

    public static void baumKrone(int hoehe) {
        for (int i = 1; i <= hoehe; i++) {
            zeile(hoehe - i, i * 2 - 1);
        }
    }

    public static void baumStamm(int breite, int hoehe) {
        int leerzeichen = (breite - 1) / 2;
        for (int i = 0; i < hoehe; i++) {
            zeile(leerzeichen, breite);
        }
    }

    public static void zeile(int leerzeichen, int sterne) {
        for (int i = 0; i < leerzeichen; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < sterne; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
