package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Espresso");
        arrayList.add("Americano");
        arrayList.add("Latte");
        arrayList.add("Cappuccino");

        System.out.println("For: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("For-each: ");
        for (String item : arrayList) {
            System.out.println(item);
        }

        System.out.println("While: ");
        int index = 0;
        while (index < arrayList.size()) {
            System.out.println(arrayList.get(index));
            index++;
        }

        System.out.println("Iterator: ");
        for (Iterator<String> iterator = arrayList.iterator(); iterator.hasNext(); ) {
            String element = iterator.next();
            System.out.println(element);
        }

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("Sum of numbers: " + Util.getSum(numbers));

        System.out.println("Odd numbers: " + Util.getOddNumber(numbers));

        System.out.println("convertToStringList: " + Util.convertToStringList(numbers));

        List<String> strings = Arrays.asList("35x", "double");
        System.out.println("Doubled strings: " + Util.doubling(strings));

    }
}