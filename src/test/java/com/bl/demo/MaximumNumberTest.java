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
    public void testCodeConstructor_IntegerObjectArray_ShouldReturnMaximum() {
        Comparable max = new MaximumNumber<>(1,2,3).printMax();
        Assert.assertEquals(3,max);
    }

    @Test
    public void testCodeConstructor_StringObjectArray_ShouldReturnMaximum() {
        Comparable max = new MaximumNumber<>("abc","def","xyz").printMax();
        Assert.assertEquals("xyz",max);
    }

    @Test
    public void testCode_IntegerObjectArrayWithMultipleParameter_ShouldReturnMaximumNumber() {
        Comparable max = new MaximumNumber<>(11,2,3,5,9,10,8).printMax();
        Assert.assertEquals(11,max);
    }


    @Test
    public void testCode_FloatObjectArrayWithMultipleParameter_ShouldPrintMaximumNumber() {
        Comparable max = new MaximumNumber<>(1.1f,2.1f,3.1f).printMax();
        Assert.assertEquals(3.1f,max);
    }
}
