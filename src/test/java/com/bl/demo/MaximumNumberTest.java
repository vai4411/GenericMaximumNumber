package com.bl.demo;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

    @Test
    public void testCode_IntegerObjectArray_ShouldReturnMaximumNumber() {
        int max = MaximumNumber.maximum( new Integer[] {1,2,3});
        Assert.assertEquals(3,max);
    }
}
