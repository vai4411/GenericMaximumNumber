package com.bl.demo;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

    @Test
    public void testCode_IntegerObjectArray_ShouldReturnMaximumNumber() {
        Comparable max = new MaximumNumber<>(new Integer[]{1, 2, 3}).maximum();
        Assert.assertEquals(3,max);
    }

    @Test
    public void testCode_FloatObjectArray_ShouldReturnMaximumNumber() {
        Comparable max = new MaximumNumber<>(new Float[] {1.1f,2.1f,3.1f}).maximum();
        Assert.assertEquals(3.1f, (Float) max,0.01);
    }

    @Test
    public void testCode_StringObjectArray_ShouldReturnMaximum() {
        Comparable max = new MaximumNumber<>( new String[] {"abc","def","ghi"}).maximum();
        Assert.assertEquals("ghi",max);
    }

    @Test
    public void testCodeConstructor_ObjectArray_ShouldReturnMaximum() {
        Comparable max = new MaximumNumber<>(1,2,3).maximumValue(3);
        Assert.assertEquals(3,max);
    }

    @Test
    public void testCode_IntegerObjectArrayWithMultipleParameter_ShouldReturnMaximumNumber() {
        Comparable max = new MaximumNumber<>(11,2,3,5,9,10,8).maximumValue(7);
        Assert.assertEquals(11,max);
    }
}
