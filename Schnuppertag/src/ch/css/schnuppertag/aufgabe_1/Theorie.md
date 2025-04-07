# Theorie für Aufgabe 1

### Variablen

Als erster Schritt wollen wir eine Variable erstellen und diese in der Konsole ausgeben.  
Eine Variable verwenden wir, um eine Zahl oder eine Zeichenkette zu speichern, sodass wir den Inhalt später
wiederverwenden können.

Du kannst es dir wie eine Kartonkiste vorstellen. Du legst eine Zahl in eine Kiste und später, wenn du den Inhalt
wieder benötigst, kannst du den Karton öffnen und den Inhalt herausnehmen. Du kannst der Wert in der Kartonkiste auch
ändern.

**Aufbau einer Variabel:**
```
int variabelName = 10;
String variabelName = "Zeichenkette";
```

Eine Variable besteht aus einem **Datentypen**, wie int oder String und einem **Namen**.
Den Namen kannst du selber setzen, er darf jedoch keine Leerzeichen beinhalten.

[String] -> Wird verwendet, um eine Variabel mit Zeichen zu erstellen. Der Inhalt muss immer in Hochkommas
stehen.  
[int] -> Wird verwendet, um eine Variabel mit Zahlen zu erstellen. Die Variabel kann nichts anderes als eine Zahl
beinhalten.

[variabelName] -> Folgt immer nach dem int oder String und ist grundsätzlich frei wählbar. Du kannst sie beliebig
benennen. Es gibt jedoch einige Einschränkungen, auf welche wir jetzt nicht näher draufeingehen.
[=] -> Befindet sich zwischen dem Variablennamen und dem Wert, welcher abgelegt wird.
[10] -> Der Wert, in diesem Fall eine Zahl, welche in der Variabel gespeichert wird.

---

### Ausgabe in der Konsole

**Du kannst jegliche sachen in der Konsole ausgeben, und zwar wie folgt:**
```
System.out.println("Hallo Welt");

oder auch

System.out.println(variabel);
```
Du kannst auch verschiedene Variabeln hintereinander ausgeben.
```
System.out.println("hallo" + variabel1 + variabel2);
```

### WICHTIG! Wenn du eine Variable verwenden möchtest, schreibst du sie NICHT in Gänsefüsschen.

**Beachte:** Grundsätzlich schreibt man jeglichen Text (natürlich ausser Variablen) in Gänsefüssen, hingegen Zahlen ohne
diese Sonderzeichen geschrieben werden.

---

### Variabel erstellen und ausgeben

```
int arbeitswegInMinuten = 20;

System.out.println(arbeitswegInMinuten);
```

> Gibt in der Konsole folgendes aus: 20
