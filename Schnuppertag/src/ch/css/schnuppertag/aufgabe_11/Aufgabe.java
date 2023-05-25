package aufgabe_11;

public class Aufgabe {
    public static void main(String[] args) {
        /*
        Dein Programm soll einen Waldbrand simulieren. Zunächst besteht der Wald aus einem rechteckigen Raster (zweidimensionales Feld) aus Bäumen (B), Steinen (S) und leerem Waldboden (-). Die Verteilung, d.h. wo ein Baum, wo ein Stein und wo leerer Waldboden platziert wird, passiert zufällig, wenn der Wald erstellt wird. Nach Start der Simulation geschieht über einen Timer gesteuert in jedem Zeitschritt t folgendes:

        Jeder Baum wird sich mit einer kleinen Wahrscheinlichkeit von z entzünden (Funken, Blitze, weggeworfene Zigarettenstummel, etc.). Brennende Bäume werden mit dem Buchstaben F (Feuer) bezeichnet.
        Jeder Baum (B), der einen brennenden Nachbarn (F) hat, wird in jedem Fall auch zu brennen beginnen (F). Jedoch können Bäume, die im Zeitschritt t zu brennen beginnen, erst im nächsten Zeitschritt (t + 1) die umliegenden Bäume entfachen.
        Sobald ein brennender Baum (F) alle umliegenden Bäume entfacht hat, verglüht er (f).
        Verglühte Bäume (f) werden schliesslich zu einem leeren Stück Waldboden und damit zu Humus (-).
        Auf jedem leeren Stück Waldboden, respektive Humus (-) wird mit einer geringen Wahrscheinlichkeit w ein neuer Baum (B) wachsen.
        Steine (S) können nicht brennen und an deren Stelle wird auch nie ein neues Bäumchen (B) keimen.

        Bevor er die Simulation startet, soll der Benutzer die Wahrscheinlichkeiten z (Funkenentzündung) und w (Wachstum) sowie die Breite und die Tiefe des Waldes eingeben können. Nach jedem Zeitschritt wird der Wald neu gezeichnet.

        Als Zusatz kannst du alles noch mit Methoden lösen.
        Es sollte die Methoden baumStamm, baumKrone und eine Zeile geben.
        */
    }
}
