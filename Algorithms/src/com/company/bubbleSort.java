package com.company;

import java.util.List;
import static com.company.SortUtils.*;

public class bubbleSort implements SortAlgorithm{

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array){
        for(int i = 0, size = array.length; i < size - 1; ++i)
        {
            boolean swapped = false;
            for(int j = 0; j < size - 1; ++j)
            {
                if(greater(array[j], array[j+1]))
                {
                    swap(array, j ,j+1);
                    swapped = true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
        return array;
    }
}
