package me.ellebelle;

public class CounterDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();

        counter.increment();
        counter.increment();
        counter.increment();
        counter.decrement();

        Counter counter2 = new Counter();  // använder konstruktor nr 1

        Counter counter3 = new Counter(10); // använder konstruktor nr 2

        IO.println(counter.getCounter());
        IO.println(counter2.getCounter());
        IO.println(Counter.getInstances());  // eftersom det är en statisk metod kan jag fråga klassen "hur många st av dig har jag skapat?"
        IO.println(counter.getInstances()); // detta går med men bättre med det andra.
    }
}
