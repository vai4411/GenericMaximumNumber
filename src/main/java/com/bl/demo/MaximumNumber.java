package com.bl.demo;

public class MaximumNumber<T extends Comparable> {

    public T maximum(T[] array) {
        T max = array[0];
        for (int element=0 ; element<array.length ; element++) {
            if (array[element].compareTo(max) > 0)
                max = array[element];
        }
        return max;
    }
}
