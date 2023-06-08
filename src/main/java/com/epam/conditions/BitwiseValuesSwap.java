package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {

        second = second ^ first;
        first = second ^ first;
        second = second ^ first;

        System.out.println(first);
        System.out.println(second);
    }

}
