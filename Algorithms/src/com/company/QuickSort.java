package com.company;

import static com.company.SortUtils.*;

public class QuickSort implements SortAlgorithm{

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array){
        doSort(array, 0, array.length-1);
        return array;
    }

    public static<T extends Comparable<T>> void doSort(T[] array, int left, int right){
        if(left < right){
            int pivot = randomPartition(array, left, right);
            doSort(array, left, pivot -1);
            doSort(array,pivot, right);
        }
    }

    private static <T extends Comparable<T>> int randomPartition(T[] array, int left, int right){
        int randomIndex = left + (int)(Math.random() * (right - left + 1));
        swap(array, randomIndex, right);
        return partition(array, left, right);
    }

    private static <T extends Comparable<T>> int partition(T[] array, int left, int right){
        int mid = (left+right) >>> 1;
        T pivot =  array[mid];

        while(left <= right){
            while (less(array[left], pivot)) {
                ++left;
            }

            while(less(pivot, array[right])){
                --right;
            }

            if(left <= right){
                swap(array, left, right);
                ++left;
                --right;
            }
        }
        return left;
    }
}
