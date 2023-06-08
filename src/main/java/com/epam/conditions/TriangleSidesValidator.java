package com.epam.conditions;

import java.util.Arrays;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        double[] triangle = new double[] {firstSide, secondSide, thirdSide};
        int n = 0;
        for (int i = 1; i < triangle.length; i++) {
            if(triangle[n] < triangle[i])
                n = i;
        }
        double sum = 0;
        for (int i = 0; i < triangle.length; i++) {
            if(i != n) sum += triangle[i];
        }
        System.out.println(sum > triangle[n] ? "this is a valid triangle" : "it's not a triangle");
    }

}
