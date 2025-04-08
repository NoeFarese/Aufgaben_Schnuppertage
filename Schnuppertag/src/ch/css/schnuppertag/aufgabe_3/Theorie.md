# Theorie für Aufgabe 3
## Operatoren
In Java gibt es die folgenden **Operatoren**: 
```
+ : Addition. Zahlen oder auch Zeichenketten (Strings) addieren/zusammenfügen.
- : Subtrakion. Zahlen subtrahieren.
* : Multiplikation. Zahlen multiplizieren.
/ : Division. Zahlen dividieren.
```
**Operatoren** welche als **Bedingungen** verwendet werden (for-Schlaufe, if-else usw.):

```
<       : kleiner als
>       : grösser als
<=      : kleiner oder gleich
>=      : grösser oder gleich
==      : gleich für Zahlen
!=      : nicht gleich
.equals : gleich für Strings
```

Mit ``=`` teilt man einer Variable einen Wert zu und mit ``==`` vergleicht man zwei Werte.

**Modulo:**  
Bei Modulo verwendet man den Operator ``%``. Mit diesem Operator bekommt man den **Rest** einer
Division von zwei Zahlen.  

**Beispiele:**
```
15 % 5 = 0 -> 15 geteilt durch 5 gibt 3 mit Rest 0
16 % 5 = 1 -> Gibt einen Rest von 1, da 15 die nächst teilbare Zahl ist
32 % 9 = 5

(35 % 5 == 0) -> überprüfen, ob 35 ohne Rest durch 5 teilbar ist
```

## Bedingungen
Jetzt können wir diese Operatoren bei einer ``if-else`` Bedingung anwenden.  
``If`` bedeutet **falls** und ``else`` bedeutet **sonst**.

### If-Abfrage ohne else:  
In der Klammer steht die **Bedingung**, wenn diese zutrifft wird der Code in den geschwungenen Klammern (``{}``) ausgeführt.  

**Beispiel:** 
```
int zahl = 5;

if(zahl == 5) {
    System.out.println("Die Zahl ist 5.");
} 
```
Hier trifft die Bedingung zu, denn die Variable ``zahl`` (Wert 5) ist gleich ``5``. In der Konsole wird ``Die Zahl ist 5.`` ausgegeben.


### If-Abfrage mit else:
Sollte die Bedingungn nicht zutreffen, tritt (falls vorhanden) der ``else`` Fall ein und der Code im ``else{}`` wird ausgeführt.  
**Beispiel:**
```
int zahl = 37;

if(zahl != 5) {
    System.out.println("Die Zahl ist nicht 5.");
} else {
    System.out.println("Die Zahl ist nicht 5.");
}
```
Wenn zahl jetzt 5 wäre, würde der If-Block übersprungen und die Ausgabe nicht ausgeführt werden.

### If-Abfrage mit else-if

Um mehrere Bedingungen zu prüfen, kann man beliebig viele ``else if`` hinzufügen.  
**Beispiel:**
```
int zahl = 10;  

if(zahl == 5){
    System.out.println("Die Variable zahl hat den Wert 5 gespeichert.");
} else if (zahl == 10) {
    System.out.println("Die Variable zahl hat den Wert 10 gespeichert.");
} else{
    System.out.println("Die Variable zahl hat einen anderen Wert als 5 oder 10");
}
```

Bei diesem Beispiel trifft die zweite Bedingung zu und der Code im ``else if`` wird ausgeführt. 
