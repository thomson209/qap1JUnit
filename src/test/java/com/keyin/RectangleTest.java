package com.keyin;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void testGetArea(){
        Rectangle rectangleUnderTest = new Rectangle(1.2f, 2.4f);

        Assert.assertTrue(rectangleUnderTest.getArea() == (1.2 * 2.4));
    }
}
