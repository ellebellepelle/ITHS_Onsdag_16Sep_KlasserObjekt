package me.ellebelle;

public class MultipleIntegers {

    // använd en array för att lagra många värden
    // vårt fält är i det här fallet en int array som heter values och vi tilldelar den en refferens till ett
    // objekt som skapas i minnet.
    // behöver vi fler platser så skapar vi en ny array med fler platser.
    private int[] values = new int[10];
    private int counter = 0; // en räknare som håller ordning på hur många värden vi har sparat.

    // metod för att stoppa in värden
    public void add(int value) {
        // todo: handle the case where values is full. counter > values.length -1
        // med hjälp av denna add metoden kan jag skicka in ett värde som jag vill ska sparas i min array
        values[counter++] = value;
    }

    public int getValue(int index) {
        // todo: enter when index is > number of values stored
        return values[index];
    }

    public int size() {
        return counter;
    }


    static void main() {
        MultipleIntegers integers = new MultipleIntegers();
        integers.add(100);
        integers.add(10);
        integers.add(20);
        integers.add(0);

        IO.println(integers.getValue(0));

        for (int i = 0; i < integers.size(); i++) {
            IO.println(integers.getValue(i));
        }
    }


}
