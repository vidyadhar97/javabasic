package com.company;

public class Main {

    public static void main(String[] args) {
        int[]a = {9,8,7,6,5};
        int max = Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <=4; i++) {
            if(max <= a[i])
                max = a[i];
            if(min >= a[i])
                min = a[i];

        }
        System.out.println("Max no is " + max );
                System.out.println("Min no is " + min );

    }
    }