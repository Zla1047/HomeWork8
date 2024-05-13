package org.example;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static List<Integer> getOddNumber(List<Integer> numbers) {
        List<Integer> oddNum = new ArrayList<>();
        for (int num : numbers) {
            if (num %2 != 0) {
                oddNum.add(num);
            }
        } return oddNum;
    }

    public static List<String> convertToStringList(List<Integer> numbers) {
        List<String> stringList = new ArrayList<>();
        for (int num : numbers) {
            stringList.add(String.valueOf(num));
        } return stringList;
    }

    public static List<String> doubling(List<String> strings) {
        List<String> doublingString = new ArrayList<>();
        for (String str : strings) {
            doublingString.add(str + str);
        } return doublingString;
    }


}
