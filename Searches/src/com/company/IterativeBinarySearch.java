package com.company;

import static java.lang.String.format;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;


public class IterativeBinarySearch implements SearchAlgorithm{

    public <T extends Comparable<T>> int find(T[] array, T key) {
        int left, right, k, comp;

        left = 0;
        right = array.length - 1;

        while(left <= right){
            k = (left + right) >>> 1;
            comp = key.compareTo(array[k]);

            if(comp == 0){
                return k;
            }else if(comp < 0){
                right = --k;
            }else{
                left = ++k;
            }
        }
        return -1;
    }
}
