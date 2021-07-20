package com.company;

import static java.lang.String.format;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class BinarySearch implements SearchAlgorithm{

    public <T extends Comparable<T>> int find(T array[], T key){
        return search(array, key, 0 , array.length);
    }

    private <T extends Comparable<T>> int search(T array[], T key, int left, int right){
        if(right < left)
            return -1;

        int median = (left + right ) >>> 1;
        int comp = key.compareTo(array[median]);

        if(comp == 0){
            return median;
        }else if(comp < 0){
            return search(array, key, left, median - 1);
        }else{
            return search(array, key, median +1, right);
        }
    }
}
