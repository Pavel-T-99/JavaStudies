package com.company;

import java.util.Random;
import java.util.stream.Stream;


public class LinearSearch implements SearchAlgorithm{

    public <T extends Comparable<T>> int find(T[] array, T value){
        for(int i = 0; i < array.length; i++){
            if(array[i].compareTo(value) == 0){
                return i;
            }
        }
        return -1;
    }

}
