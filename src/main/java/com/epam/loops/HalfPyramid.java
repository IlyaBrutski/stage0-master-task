package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            for (int k = 0; k < cathetusLength; k++) {
                if (k == cathetusLength - i-1) {
                    for (int j = i+1; j >= 1; j--) {
                        System.out.print("*");
                    }
                    break;
                } else System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
