# Theorie für Aufgabe 2

Bei dieser Aufgabe schauen wir **Benutzereingaben** an.

Für Benutzereingaben brauchen wir einen **Scanner**.  
Einen solchen **Scanner** erstellt man wie folgt: 

```
Scanner meinScanner = new Scanner(System.in); 

int benutzereingabe = meinScanner.nextInt(); 
```

**Schritt für Schritt erklärt:**
```
Scanner meinScanner = new Scanner(System.in);
```
Hier wird ein neuer Scanner mit dem Namen meinScanner erstellt. 

```
int benutzereingabe = meinScanner.nextInt();
```
Danach können wir eine Variabel erstellen und die Eingabe vom Benutzer darin speichern.  
In diesem Beispiel wollen wir eine Zahl speichern, deshalb verwenden wir ``int`` und ``.nextInt()``. Für eine Zeichenkette verwendet man ``String`` und ``.nextLine()``.

**Beispiel:**
```
System.out.println("Gib einen Benutzernamen ein: ");

Scanner meinScanner = new Scanner(System.in);
String benutzername = meinScanner.nextLine();

System.out.println("Hallo " + benutzername);
```