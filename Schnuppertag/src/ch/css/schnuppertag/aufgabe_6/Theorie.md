# Theorie für Aufgabe 6

In Java kannst du mithilfe von Random eine zufällige Zahl generieren lassen. Verwende es dazu wie folgt:
<pre>
Random random = new Random();
int randomZahl = random.nextInt();
</pre>

Willst du nur Zahlen in einem Bereich von null bis z.B. 100 verwenden, so kannst du es wie folgt umsetzen:
<pre>
int randomZahl = random.nextInt(100);
</pre>
