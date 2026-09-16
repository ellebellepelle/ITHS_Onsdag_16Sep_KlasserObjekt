package me.ellebelle;

import java.util.Arrays;

public class MultipleIntegers {

    // använd en array för att lagra många värden
    // vårt fält är i det här fallet en int array som heter values och vi tilldelar den en refferens till ett
    // objekt som skapas i minnet.
    // behöver vi fler platser så skapar vi en ny array med fler platser.
    private int[] values = new int[10];
    private int counter = 0; // en räknare som håller ordning på hur många värden vi har sparat.

    // metod för att stoppa in värden
    public void add(int value) {
        // handle the case where values is full. counter > values.length -1
        if (counter >= values.length) {
            growArray();
        }
        // med hjälp av denna add metoden kan jag skicka in ett värde som jag vill ska sparas i min array
        values[counter++] = value;
    }

    /*
    // inte optimal lösning:
    private void growArray() {
        // Ny stöör array
        int[] temp = new int[values.length * 2];
        // Kopiera från original arrayen till ny större
        for (int i = 0; i< values.length; i++) {
            temp[i] = values[i];
        }
        // gör båda ovan tillsammans med en färdig metod är att rekomendera

        // sätt values att referera til den nya arrayen
        values = temp;
    }
    */

    // den inbyggda metoden som är den optimala lösningen med Arrays.copyOf :
    private void growArray() {
        values = Arrays.copyOf(values,values.length * 2);
    }


    public int getValue(int index) {
        // todo: enter when index is > number of values stored
        return values[index];
    }

    public void removeLast() {
        counter--; // måste minska counter (den som räknar upp hur många platser som är fyllda)
        values[counter] = 0;
    }

    public void removeAtIndex(int index) {
        // Alla värden efter index flyttas ett steg vänster
        for (int i = index; i < counter - 1; i++) {
            values[i] = values[i + 1];
        }
    }

    public int size() {
        return counter;
    }


    static void main() {

        MultipleIntegers integers = new MultipleIntegers();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(40);
        integers.add(50);
        integers.add(60);
        integers.add(70);
        integers.add(80);
        integers.add(90);
        integers.add(100);

        // integers.removeLast();
        integers.removeAtIndex(1);

        IO.println(integers.getValue(0));

        for (int i = 0; i < integers.size(); i++) {
            IO.println(integers.getValue(i));
        }
    }


}
