package me.ellebelle;

public class Counter {
    private int counter = 0;

    private static int instances = 0; // klassvariabel

    // konstruktor varje gång den körs så räknas värdet upp i instances variablen.
    public Counter() {
        instances++;
    }

    // en till konstruktor:
    public Counter(int startValue) {
        counter = startValue;
        instances++;
    }

    public void increment() {
        counter++;
    }

    public void decrement() {
        counter--;
    }

    public int getCounter() {
        return counter;
    }

    // statisk metod som här till klassen därför kan denna med vara statiska.
    // kan använda denna metoden utan att jag har ett objekt.
    public static int getInstances() {
        return instances;
    }
}
