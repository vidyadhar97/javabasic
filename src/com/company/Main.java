package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[] radiusList = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i <= 4; i++) {
            int radius = radiusList[i];
            double circumference = (2 * 3.14 * radius);
            System.out.println("Circumference for radius "+ radius+" is " + String.format("%.2f",circumference));
            double area = 3.14 * radius * radius;
            System.out.println("Area for " + radius+" is "+ area);
        }
    }
    }