/* 
* Name: Clayton Black
* Date: 09-13-2019
* Assignment Name: Lab Assignment 2A
* Assignment Brief: Classes and Objects
* Sources:
*  -
*/

public class Vendor {
    private int id;
    private String name;
    private double[] quarterlyPurchaseOrderTotals = new double[4];

    Vendor(int id, String name){
        setID(id);
        setName(name);
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getQuarterlyPurchaseOrderTotal(int quarter){
        return quarterlyPurchaseOrderTotals[quarter-1];
    }

    private void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuarterlyPurchaseOrderTotal(int quarter, double amount) {
        quarterlyPurchaseOrderTotals[quarter-1] = amount;
    }

    public double sumQuarterlyPurchaseOrderTotals(){
        double total = 0;
        for(double quarter: quarterlyPurchaseOrderTotals)
            total = total + quarter;

        return total;
    }

    public String toString(){

        return String.format("Vendor Name: %s\n", name) +
                String.format("Vendor ID: %s\n", id) +
                String.format("First quarter purchase order total: $%.2f\n", quarterlyPurchaseOrderTotals[0]) +
                String.format("Second quarter purchase order total: $%.2f\n", quarterlyPurchaseOrderTotals[1]) +
                String.format("Third quarter purchase order total: $%.2f\n", quarterlyPurchaseOrderTotals[2]) +
                String.format("Fourth quarter purchase order total: $%.2f\n", quarterlyPurchaseOrderTotals[3]);
    }
}
