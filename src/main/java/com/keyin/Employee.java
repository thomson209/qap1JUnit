package com.keyin;

public class Employee{
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    static int count = 0;

    //Parameterized constructor
    Employee(int id, String fn, String ln, double sal)
    {
        this.id = id;
        this.firstName = fn;
        this.lastName = ln;
        this.salary = sal;
        count++;
    }
    //Copy constructor
    Employee(Employee e)
    {
        this.id = e.id;
        this.firstName = e.firstName;
        this.lastName = e.lastName;
        this.salary = e.salary;
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
    public double getSalary()
    {
        return this.salary;
    }
    public String getName()
    {
        return(firstName + " " + lastName);
    }

    public void setSalary(double sal)
    {
        this.salary = sal;
    }

    public double getAnnualSalary()
    {
        return (12* salary);
    }
    public double raiseSalary (double percentage)
    {
        this.salary = this.salary + (percentage/100*this.salary);
        return (this.salary);
    }
    public String toString()
    {
        return (getName() + " has a salary " + this.salary + " and we have " + count + " employees.");
    }
}
