# Theorie für Aufgabe 4

## Schlaufen

Schlaufen werden dazu verwendet um Abläufe in einem Programm **mehrmals auszuführen**.

### While-Schlaufe

Eine **While-Schlaufe** wieder holt den Code in den geschwungenen Klammern, solange die Bedingung zutrifft.

```
int x = 0;
int y = 10;

while (x <= y) {
    System.out.println(x);
    x = x + 1;
}
```

Ergibt: `1` `2` `3` `4` `5` `6` `7` `8` `9` `10`

`while` -> Definiertes Schlüsselwort (wie if) kennzeichnet eine While-Schlaufe  
`(x <= y)` -> Code wird ausgeführt so lange diese Bedingung zutrifft.

Bei diesem Beispiel werden zwei Variablen erstellt. `x` ist kleiner oder gleich `y` und der Code in der Schlaufe
wird ausgeführt.  
In der Schlaufe wird  `x` um 1 erhöht. Dann wird wieder überprüft, ob `x` kleiner oder gleich `y` ist.  
Das passiert jetzt so lange, bis `x` grösser als `y` ist. Dann geht das Programm nach der Schlaufe weiter.

### For-Schlaufe

Eine For-Schlaufe funktinoiert gleich, wie die While-Schlaufe, nur dass man die **hochzuzählende Variable** direkt im *
*Kopf der Schlaufe** erstellt und hochzählt.

```
for(int x = 0; x <= 10; x++) {
    System.out.println(x);
}
```

`for` -> Definiertes Schlüsselwort (wie if) kennzeichnet eine For-Schlaufe  
`int x = 0;` -> Erstes Segment, hier wird eine Variable erstellt.  
`x <= 10;` -> Zweites Segment, die Bedingung, solange diese erfüllt ist, wird der Code in der Schlaufe ausgeführt.  
`x ++;` -> Drittes Segment, nach jedem Durchlauf wird die Variabel hochgezählt. 

`x++` macht dasselbe, wie `x = x + 1` 

**Beispiel:**
```
for(int i = 0; i < 5; i++) {
    if(i % 2 == 0) {
        System.out.println(i + " ist gerade");
    } else {
        System.out.println(i + " ist ungerade");
    }
}
```
Ergibt:  
`0 ist gerade`  
`1 ist ungerade`  
`2 ist gerade`  
`3 ist ungerade`  
`4 ist gerade`

