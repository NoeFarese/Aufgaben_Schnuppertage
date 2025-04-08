# Theorie für Aufgabe 3

In Java gibt es verschiedene Operatoren. Es gibt folgende Operatoren:
<pre>
+ : Addition. Mit Plus kann man Zahlen oder auch Zeichenketten (Strings) zusammenrechnen/zusammenfügen.
- : Subtrahtion. Mit Minus kann man Zahlen subtrahieren. Funktioniert nicht mit Strings.
/ : Division. Man kann damit Zahlen geteilt durch rechnen.
* : Multiplikation. Man kann damit Zahlen mal rechnen.

Operatoren welche als Bedingungen verwendet werden (for-Schlaufe, if-else usw.):
< : kleiner als
> : grösser als
<= : kleiner oder gleich
>= : grösser oder gleich
== : gleich --> werden bei Zahlen verwendet
!= : nicht gleich
.equals : Strings vergleichen

Mit "=" teilt man einer Variable einen Wert zu und mit "==" vergleicht man einen Wert.

Modulo:
Bei Modulo verwendet man den Operator "%". Mit diesem Operator bekommt man den Rest einer
Division von zwei Zahlen. 

Beispiele:
15 % 5 = 0 --> 15 geteilt durch 5 gibt keinen Rest darum 0
16 % 5 = 1 --> kommt bis 15 und dann noch 1 für den Rest
32 % 9 = 5
</pre>

Jetzt können wir diese Operatoren in einem If-else anwenden.

<pre>
    int x = 5;

    if(x == 5){
    System.out.println("Die Variable x hat den Wert 5 gespeichert");
    } else {
        System.out.println("Die Variable x hat einen anderen Wert als 5 gespeichert.");
    }

</pre>

"If" bedeutet falls und "else" bedeutet sonst. Man kann also kontrollieren ob eine bestimmte Variable 
einen gewissen Wert gespeichert hat und falls dies zutrifft kann man Logik ausführen. In unserem Fall ist das eine einfache Ausgabe in der Konsole.
Wenn es aber nicht zutrifft, wird der If-Block übersprungen und es geht zum Else-Block. Dort werden dann die Anweisungen im Else-Block ausgeführt.

Das "if" braucht immer eine Bedingung --> bei diesem Beispiel ist es x == 5. Also wird es nur ausgeführt wenn die Variable x den Wert 5 gespeichert hat.
Das "else" braucht keine Bedingung. Man kann das "else" auch weglassen und nur eine if-Abfrage machen.

Beispiel für eine If-Abfrage ohne else:
<pre>
    if(x != 5){
    System.out.println("Die Variable x ist nicht 5");
}
</pre>
Wenn x jetzt 5 wäre, würde es einfach den If-Block überspringen und beim Code weitergehen, die Ausgabe wird nicht ausgeführt.

Es gibt auch die Möglichkeit mehrere Bedingungen zu kontrollieren. Dann kann man beispielsweise eine if-else-if Abfrage machen.

Beispiel:

<pre>
    int x = 5;  
    int y = 10;

    if(x == 5){
    System.out.println("Die Variable x hat den Wert 5 gespeichert.");
    } else if (y == 10) {
        System.out.println("Die Variable y hat den Wert 10 gespeichert.");
    } else{
    System.out.println("Beide Variablen x und y haben einen anderen Wert als 5 oder 10");
}
</pre>
