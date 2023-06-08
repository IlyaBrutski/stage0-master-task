package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            for (int k = 0; k < cathetusLength*2-1; k++) {
                if (k == cathetusLength - i-1) {
                    for (int j = i+1; j >= 1; j--) {
                        System.out.print(j);
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print(j+2);
                    }
                    break;
                } else System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
