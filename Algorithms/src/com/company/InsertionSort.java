package com.company;

import static com.company.SortUtils.less;
import static com.company.SortUtils.print;

public class InsertionSort implements SortAlgorithm{
    @Override
    public <T extends Comparable<T>> T[] sort(T[] array){
        for(int i = 1; i < array.length; i++)
        {
            T insertValue = array[i];
            int j;
            for (j = i-1; j>=0 && less(insertValue, array[j]); j--)
            {
                array[j + 1] = array[j];
            }
            if(j != i - 1)
            {
                array[j + 1] = insertValue;
            }
        }
        return array;
    }

}
