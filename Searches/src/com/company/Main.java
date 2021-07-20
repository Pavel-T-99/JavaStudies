package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.String.format;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Random random = ThreadLocalRandom.current();

        int size = 10;
        int maxEl = 1000;

        Integer[] integers = IntStream.generate(() -> random.nextInt(maxEl))
                .limit(size)
                .sorted()
                .boxed()
                .toArray(Integer[]::new);

        Integer[] integers1 = Stream.generate(() -> random.nextInt(maxEl))
                .limit(size)
                .toArray(Integer[]::new);

        int want = integers[random.nextInt(size-1)];

        BinarySearch bsearch = new BinarySearch();
        int atIndex = bsearch.find(integers, want);

        System.out.println(
                format(
                        "I want: %d. Found %d at index %d. An array lenght %d",
                        want, integers[atIndex], atIndex, size
        ));

        int toCheck = Arrays.binarySearch(integers, want);
        System.out.println(
                format(
                        "Found by system method at an index: %d. Is equal: %b", toCheck,toCheck == atIndex
                )
        );

        int want1 = integers1[random.nextInt(size-1)];
        LinearSearch lsearch = new LinearSearch();
        int atIndex1 = lsearch.find(integers1,want1);

        System.out.println(
                format(
                        "I want: %d. Found %d at index %d. An array length %d",
                        want1, integers1[atIndex1], atIndex1, size
                )
        );

        Integer[] integers2 =
                Stream.generate(() -> random.nextInt(maxEl)).limit(size).sorted().toArray(Integer[]::new);

        // the element that should be found
        Integer shouldBeFound = integers2[random.nextInt(size - 1)];

        IterativeBinarySearch search = new IterativeBinarySearch();
        int atIndex2 = search.find(integers2, shouldBeFound);

        System.out.println(
                String.format(
                        "Should be found: %d. Found %d at index %d. An array length %d",
                        shouldBeFound, integers2[atIndex2], atIndex2, size));

        int toCheck2 = Arrays.binarySearch(integers2, shouldBeFound);
        System.out.println(
                format(
                        "Found by system method at an index: %d. Is equal: %b", toCheck2, toCheck2 == atIndex2));


    }
}
