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

    public static Float maximum(Float[] array) {
        float max = array[0];
        for (float i : array) {
            if (max < array[(int) (i-1)])
                max = array[(int) (i-1)];
        }
        return max;
    }

    public static String maximum(String[] array) {
        String max = null;
        char c = array[0].charAt(0);
        int count = 0;
        for (String i : array) {
            if (c < array[count].charAt(0))
                max = array[count];
            count++;
        }
        return max;
    }
}
