# Theorie für Aufgabe 8

Damit du einen String in einen Integer umwandeln kannst, kannst du den Code von unten verwenden.
<pre>
int number = Integer.parseInt("2")
</pre>

Um eine Entscheidung zu machen, bei denen mehrere Fälle vorkommen könnten, kann man Switch case verwenden.
<pre>
switch (operator) {
    case "+":
        System.out.println(plus);
        break;
    case "-":
        System.out.println(minus);
        break;
    case "/":
        System.out.println(geteiltdurch);
        break;
    case "*":
        System.out.println(mal);
        break;

    default:
        System.out.println("error");
        break;
}
</pre>
