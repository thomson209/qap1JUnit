package com.keyin;

import java.util.Objects;

public class Employee{
    private int id;
    private String firstName;
    private String lastName;
    private double monthlySalary;

    static int count = 0;

    //Parameterized constructor
    public Employee(int id, String firstName, String lastName, double monthlySalary)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
        count++;
    }
    //Copy constructor
    Employee(Employee e)
    {
        this.id = e.id;
        this.firstName = e.firstName;
        this.lastName = e.lastName;
        this.monthlySalary = e.monthlySalary;
        count++;
    }
    //Getters and setters
    public int getID()
    {
        return this.id;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public double getMonthlySalary()
    {
        return this.monthlySalary;
    }
    public String getName()
    {
        return(firstName + " " + lastName);
    }

    public void setMonthlySalary(double monthlySalary)
    {
        this.monthlySalary = monthlySalary;
    }

    public double getAnnualSalary()
    {
        return (12* monthlySalary);
    }
    public double raiseSalary (double percentage)
    {
        this.monthlySalary = this.monthlySalary + (percentage/100*this.monthlySalary);
        return (this.monthlySalary);
    }
    public String toString()
    {
        return (getName() + " has a salary " + this.monthlySalary + " and we have " + count + " employees.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getFirstName().equals(employee.getFirstName()) && getLastName().equals(employee.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());
    }
}
