package com.keyin;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceTest {

    @Test
    public void testGetTotal(){
        Invoice invoiceUnderTest = new Invoice("One", "tires", 4, 140.00);

        Assert.assertTrue(invoiceUnderTest.getTotal() == (140.00 * 4));
    }
}
