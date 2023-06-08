package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int num = 0;
        while(number > 0) {
            num = (num * 10) + (number % 10);
            number /= 10;
        }
        System.out.println(num);
    }

}
