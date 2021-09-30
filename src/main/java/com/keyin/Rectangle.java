package com.keyin;

public class Rectangle{
    //Attributes
    private Float length;
    private Float width;



    //parameterized constructor
    public Rectangle(Float l, Float w)
    {
        this.length = l;
        this.width = w;
    }

    public Float getLength()
    {
        return length;
    }

    public Float getWidth()
    {
        return width;
    }

    public void setLength(Float l)
    {
        this.length = l;
    }

    public void setWidth(Float w)
    {
        this.width = w;
    }

    public Float getArea()
    {
        return(this.length * this.width);
    }

    public Float getPerimeter()
    {
        return((this.length *2) + (this.width*2));
    }

    //public String toString()
    //{
    //return (this.length + this.width);
    //}



}