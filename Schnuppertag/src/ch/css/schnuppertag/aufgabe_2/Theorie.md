# Theorie für Aufgabe 2

Bei dieser Aufgabe schauen wir Scanner an. Mit dem Scanner kann eine Eingabe gemacht werden.

So erstellt man einen Scanner, speichert die Eingabe in einer Variabel und gibt diese aus:

<pre>
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Gebe eine Zahl ein: ");
        Scanner scanner1 = new Scanner(System.in); // Hier wird der Scanner erstellt
        int eingabe1 = scanner1.nextInt(); // Hier wird die Eingabe vom Scanner in einer Variabel gespeichert

        System.out.println(eingabe1);
    }
}
</pre>

Falls man einen String speichern will, muss man bei der Variabel "String eingabe1 = scanner1.nextLine();" machen.