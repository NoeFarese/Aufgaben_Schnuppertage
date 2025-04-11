# Theorie für Aufgabe 8

## String zu Int

Damit du einen String in einen Integer umwandeln kannst, kannst du den Code von unten verwenden.
```
int number = Integer.parseInt("2")
```

## Switch-Case

Ein `switch case` verwendet man , um mehrere Bedingungen nacheinander zu prüfen.  
**Beispiel:**
```
switch (operator) {
    case "+":
        System.out.println("Addtion");
        break;
    case "-":
        System.out.println("Subtraktion");
        break;
    case "*":
        System.out.println("Multiplikation");
        break;
    case "/":
        System.out.println("Division");
        break;

    default:
        System.out.println("error");
        break;
}
```
Hier wird der Reihe nach geprüft, ob die Variable "operator" einem der Operatoren `+`, `-`, `*` oder `/` entspricht.  
Sollte kein Fall (`case`) zutreffen tritt der `default` ein.

`break` wird benötigt, damit immer nur eine Bedingung zutreffen kann. 