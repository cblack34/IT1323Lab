/*
* Name: Clayton Black
* Date: 09-25-2019
* Assignment Name: Module 3 Lab 3A
* Assignment Brief: inheritance
* Sources:
*/

import java.util.Objects;

public class Store {
    private String name;
    private double taxRate;

    public Store() {
        this("Store", .07);
    }

    public Store(String name, double taxRate) {
        this.name = name;
        this.taxRate = taxRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Double.compare(store.taxRate, taxRate) == 0 &&
                name.equals(store.name);
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name +
                ", taxRate=" + taxRate +
                '}';
    }
}
