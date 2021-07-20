package com.company;

import static com.company.SortUtils.print;

public class Main {

    public static void main(String[] args) {
	Integer[] ints = {1, 55 , 2, 31, 8, 4 , 53, 12, 69, 42, 35};

	bubbleSort bubbleSort = new bubbleSort();

	InsertionSort insertionSort = new InsertionSort();

	SelectionSort selectionSort = new SelectionSort();

	selectionSort.sort(ints);

	print(ints);



    }
}
