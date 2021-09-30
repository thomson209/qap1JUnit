package com.keyin;

public class Invoice{
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    static int invoiceCount = 0;
    //Param const
    Invoice(String id, String desc, int qty, double unitPrice)
    {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
        invoiceCount++;
    }
    //Copy const
    Invoice(Invoice i)
    {
        this.id = i.id;
        this.desc = i.desc;
        this.qty = i.qty;
        this.unitPrice = i.unitPrice;
        invoiceCount++;
    }

    public String getID()
    {
        return this.id;
    }
    public String getDesc()
    {
        return this.desc;
    }
    public int getQty()
    {
        return this.qty;
    }
    public double getUnitPrice()
    {
        return this.unitPrice;
    }
    public double getTotal()
    {
        return(unitPrice * qty);
    }

    public void setQty(int qty)
    {
        this.qty = qty;
    }
    public void setUnitPrice(double unitPrice)
    {
        this.unitPrice = unitPrice;
    }
    public String toString()
    {
        return (this.id + " Quantity:" + " " + this.qty + " @ " + getUnitPrice() + " each " + " Total: " + getTotal() +" " + "Invoice count: " + invoiceCount);

    }

}
