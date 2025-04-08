# Theorie für Aufgabe 4

Weiter wollen wir uns mit den Schlaufen auseinandersetzen. <br/>
<b>Grundlagen:</b></br>
Schlaufen werden dazu verwendet um gewisse Abläufe in einem Programm mehrmals auszuführen.</br>
Beispiel einer For-Schlaufe:</br>
<pre>
for(int variableName = 0; variableName <= 10; variableName++){
    System.out.println("Die aktuelle Zahl ist: " + VariableName);
}
</pre>


for() -> for ist ein von Java definiertes Schlüsselwort und kennzeichnet eine For-Schlaufe</br>
int variableName = 0; -> Erstes Segment, hier kannst du eine Variable initialisieren.</br>
variableName <= 10; -> Zweites Segment, hier definierst du die Bedingung, wie lange die Schlaufe andauern soll bis sie fertig ist.
variableName ++; -> Im dritten Segment, damit die Bedingung irgendeinmal zutrifft, muss der Zustand der Variable angepasst werden.

Beispiel einer While-Schlaufe:</br>
<pre>
while (variableName1 == variableName2){
    System.out.println("Die aktuelle Zahl ist: " + var1);
}
</pre>

while() -> while ist ein von Java definiertes Schlüsselwort und kennzeichnet eine While-Schlaufe</br>
variableName1 == variableName2; -> ist ein Wahrheitswert und funktioniert ähnlich wie bei if() nur das es immer wiederholt wird 
bis dieser Wahrheitswert nicht mehr zutrifft.