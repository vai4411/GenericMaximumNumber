package com.bl.demo;

import javax.management.MXBean;
import java.util.Arrays;

public class MaximumNumber<T extends Comparable> {
    T[] variable;
    T firstVariable;
    T secondVariable;
    T thirdVariable;
    T[] array;
    T max;
    T temp;

    public MaximumNumber(T firstVariable, T secondVariable, T thirdVariable, T ...variable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
        this.thirdVariable = thirdVariable;
        this.variable = variable;
    }

    public MaximumNumber(T[] array) {
        this.array = array;
    }

    public T maximum() {
        max = array[0];
        for (int element=0 ; element<array.length; element++) {
            if (array[element].compareTo(max) > 0)
                max = array[element];
        }
        return max;
    }

    public T compareVariable() {
        if (firstVariable.compareTo(secondVariable) > 0 && firstVariable.compareTo(thirdVariable) > 0)
            max = firstVariable;
        else if (secondVariable.compareTo(thirdVariable) > 0)
            max = secondVariable;
        else
            max = thirdVariable;
        return max;
    }

    public T maximumValue(int parameter) {
        if (parameter >= 3)
            compareVariable();
        else {
            compareVariable();
            for(int i=0 ; i<variable.length ; i++){
                for(int j=1; j < (variable.length-i); j++){
                    if(variable[j-1].compareTo(variable[j]) > 0){
                        temp = variable[j-1];
                        variable[j-1] = variable[j];
                        variable[j] = temp;
                    }
                }
            }
            if (max.compareTo(variable[variable.length-1]) < 0)
                max = variable[variable.length-1];
        }
            return max;
        }
    }

