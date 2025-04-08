# Theorie für Aufgabe 1

Als erster Schritt wollen wir eine Variable erstellen und diese in der Konsole ausgeben.
Zuerst einmal, was sind Variablen? Eine Variable verwenden wir in der Informatik, um eine Zahl oder eine
Zeichenkette zwischenzuspeichern, um den Inhalt später wiederzuverwenden.
<br/>Du kannst es dir wie eine Kartonkiste vorstellen. Du legst eine Zahl in eine Kiste und später, wenn du den Inhalt wieder benötigst,
kannst du den Karton öffnen und den Inhalt herausnehmen. Du kannst der Wert in der Kartonkiste auch ändern.

<b>Beispiel:</b>
<pre>
int variableName = 10;
String variableName = "Zeichenkette";
</pre>
[String] -> Wird verwendet, um eine Variable mit Zeichen ins Leben zu rufen. Der Inhalt muss immer in Hochkommas stehen.<br/>
[int] -> Wird verwendet, um eine Variable mit Zahlen zu erstellen. Die Variable kann nSchts anderes als eine Zahl beinhalten.


[variableName] -> Folgt immer nach dem int oder String und ist grundsätzlich frei wählbar. Du kannst sie beliebig benennen. Es gibt jedoch einige Einschränkungen, auf welche wir jetzt nicht näher draufeingehen.
<br/>[=] -> Befindet sich zwischen dem Variablennamen und dem Wert, welcher abgelegt wird.
<br/>[10] -> Der Wert, in diesem Fall eine Zahl, welche in der Variable gespeichert wird.



<h3>Ausgabe in der Konsole</h3>
Du kannst jegliche sachen in der Konsole ausgeben, und zwar wie folgt: <br/>
<pre>
System.out.println("Hallo Welt");
//oder auch 
System.out.println(variable);
</pre>
Du kannst auch verschiedene Variablen hintereinander ausgeben.
<pre>
System.out.println("hallo" + variable1 + variable2);
</pre>

<h3>WICHTIG! Wenn du eine Variable verwenden möchtest, schreibst du sie NICHT in Gänsefüsschen.</h3>
Beachte: Grundsätzlich schreibt man jeglichen Text (natürlich ausser Variablen) in Gänsefüssen, hingegen Zahlen ohne diese Sonderzeichen geschrieben werden.