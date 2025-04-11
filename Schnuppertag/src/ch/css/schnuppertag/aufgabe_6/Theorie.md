# Theorie für Aufgabe 6

In Java kann man mithilfe von Random eine zufällige Zahl generieren lassen. Verwende es dazu wie folgt:
```
Random random = new Random();
int randomZahl = random.nextInt();
```

Willst du nur Zahlen in einem Bereich von null bis z.B. 100 verwenden, so kannst du es wie folgt umsetzen:
```
int randomZahl = random.nextInt(100);
```
