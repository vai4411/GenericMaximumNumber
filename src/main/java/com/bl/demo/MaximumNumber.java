package com.bl.demo;

public class MaximumNumber<T extends Comparable> {
    T firstVariable;
    T secondVariable;
    T thirdVariable;
    T[] array;

    public MaximumNumber(T firstVariable, T secondVariable, T thirdVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
        this.thirdVariable = thirdVariable;
    }

    public MaximumNumber(T[] array) {
        this.array = array;
    }

    public T maximum() {
        T max = array[0];
        for (int element=0 ; element<array.length; element++) {
            if (array[element].compareTo(max) > 0)
                max = array[element];
        }
        return max;
    }

    public T maximumValue() {
        if (firstVariable.compareTo(secondVariable) > 0 && firstVariable.compareTo(thirdVariable) > 0)
            return firstVariable;
        else if (secondVariable.compareTo(thirdVariable) > 0)
            return secondVariable;
        else
            return thirdVariable;
    }
}
