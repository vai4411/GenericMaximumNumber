package com.bl.demo;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

    @Test
    public void testCode_IntegerObjectArray_ShouldReturnMaximumNumber() {
        Comparable max = new MaximumNumber<>().maximum( new Integer[] {1,2,3});
        Assert.assertEquals(3,max);
    }

    @Test
    public void testCode_FloatObjectArray_ShouldReturnMaximumNumber() {
        Comparable max = new MaximumNumber<>().maximum( new Float[] {1.1f,2.1f,3.1f});
        Assert.assertEquals(3.1f, (Float) max,0.01);
    }

    @Test
    public void testCode_StringObjectArray_ShouldReturnMaximumNumber() {
        Comparable max = new MaximumNumber<>().maximum( new String[] {"abc","def","ghi"});
        Assert.assertEquals("ghi",max);
    }
}
