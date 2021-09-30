package com.keyin;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

    @Test
    public void testGetAnnualSalary(){
        Employee employeeUnderTest = new Employee(1,"Doug", "Thomson", 8000);

        Assert.assertTrue(employeeUnderTest.getAnnualSalary() == (8000 * 12));
    }

    @Test
    public void testEmployeesAreEqual(){
        Employee employeeUnderTest1 = new Employee(1, "Doug", "Thomson", 8000);
        Employee employeeUnderTest2 = new Employee(2, "Doug", "Thomson", 8000);

        Assert.assertEquals(employeeUnderTest1, employeeUnderTest2);

    }
}
