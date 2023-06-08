package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        int[] arr = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(year <= 0 || month <= 0 || month > arr.length) {
            System.out.println("invalid date");
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        arr[1] = 29;
                    }
                } else arr[1] = 29;
            }
            System.out.println(arr[month - 1]);
        }
    }
}
