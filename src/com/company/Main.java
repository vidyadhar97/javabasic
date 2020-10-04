package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Integer a[] = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list = new ArrayList();
            for(int i=0;i<=9;i++)
            {
                if(a[i]%3==0)
                    list.add(a[i]);
                }
                System.out.println(list);
            }

    }
