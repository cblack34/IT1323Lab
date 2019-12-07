/*
* Name: Clayton Black
* Date: 11-21-2019
* Assignment Name: Module 7 Lab 7A
* Assignment Brief: Sorts
* Sources:
* - Book Chapter 20, 23, and 24
*/

public class Month {
    Integer high;
    Integer low;
    String name;

    public Month(String name, Integer high, Integer low) {
        this.high = high;
        this.low = low;
        this.name = name;
    }

    @Override
    public String toString() {
        return "node{" +
                "name=" + name +
                ", low=" + low +
                ", high='" + high + '\'' +
                '}';
    }
}
