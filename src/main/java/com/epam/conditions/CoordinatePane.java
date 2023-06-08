package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        String[] quadrant = new String[]{"zero", "first", "second", "third", "fourth"};
        int n = 0;
        if (x == 0 || y == 0) {
            n = 0;
        }else if (x > 0) {
            if (y > 0) n = 1;
            else n = 4;
        } else {
            if (y > 0) n = 2;
            else n = 3;
        }
        System.out.println(quadrant[n]);
    }
}

