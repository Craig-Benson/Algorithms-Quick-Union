package com.company;

import java.util.Arrays;

public class Union {

    private int[] intArrayA = {0, 9, 6, 5, 4, 2, 6, 1, 0, 5};


    public boolean connected(int p, int q) {
        return intArrayA[p - 1] == intArrayA[q - 1];
    }

    public void union(int p,int q) {

        int y;



            y = intArrayA[p-1];
            intArrayA[q-1] = intArrayA[p-1];
            intArrayA[p-1] = intArrayA[y];




        }

//    public void root(int p) {
//
//        int y =0;
//        int z = 0;
//
//        for (int i : intArrayA) {
//            y = intArrayA[p-1];
//            intArrayA[p-1] = intArrayA[y];
//
//
//        }
//
//    }
    }


