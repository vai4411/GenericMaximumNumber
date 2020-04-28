package com.bl.demo;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

    @Test
    public void testCode_IntegerObjectArray_ShouldReturnMaximumNumber() {
        int max = MaximumNumber.maximum( new Integer[] {1,2,3});
        Assert.assertEquals(3,max);
    }

    @Test
    public void testCode_FloatObjectArray_ShouldReturnMaximumNumber() {
        float max = MaximumNumber.maximum( new Float[] {1.1f,2.1f,3.1f});
        Assert.assertEquals(3.1f,max,0.01);
    }
}
