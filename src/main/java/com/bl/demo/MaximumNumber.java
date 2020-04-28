package com.bl.demo;

public class MaximumNumber {
    public static Integer maximum(Integer[] array) {
        int max = array[0];
        for (int i : array) {
            if (max < array[i-1])
                max = array[i-1];
        }
        return max;
    }
}
