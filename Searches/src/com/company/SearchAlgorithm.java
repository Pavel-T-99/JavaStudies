package com.company;

public interface SearchAlgorithm {

    <T extends Comparable<T>> int find(T array[], T key);

}
