/*
 * Name: Clayton Black
 * Date: 09-25-2019
 * Assignment Name: Module 3 Lab 3A
 * Assignment Brief: inheritance
 * Sources:
 */

import java.util.Objects;

public class YarnStore extends Store {
    int skeinsSoldPerYear;
    int avgPricePerSkein;

    public YarnStore() {
        this("Yarn Store", .07, 0, 0);
    }

    public YarnStore(String name, double taxRate, int skeinsSoldPerYear, int avgPricePerSkein) {
        super(name, taxRate);
        this.skeinsSoldPerYear = skeinsSoldPerYear;
        this.avgPricePerSkein = avgPricePerSkein;
    }

    public int getSkeinsSoldPerYear() {
        return skeinsSoldPerYear;
    }

    public void setSkeinsSoldPerYear(int skeinsSoldPerYear) {
        this.skeinsSoldPerYear = skeinsSoldPerYear;
    }

    public int getAvgPricePerSkein() {
        return avgPricePerSkein;
    }

    public void setAvgPricePerSkein(int avgPricePerSkein) {
        this.avgPricePerSkein = avgPricePerSkein;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        YarnStore yarnStore = (YarnStore) o;
        return skeinsSoldPerYear == yarnStore.skeinsSoldPerYear &&
                avgPricePerSkein == yarnStore.avgPricePerSkein;
    }

    @Override
    public String toString() {
        return "YarnStore{" +
                "name=" + getName() +
                ", taxRate=" + getTaxRate() +
                ", skeinsSoldPerYear=" + skeinsSoldPerYear +
                ", avgPricePerSkein=" + avgPricePerSkein +
                '}';
    }

    public double avgTaxesPerYear(){
        return (avgPricePerSkein * skeinsSoldPerYear) * getTaxRate();
    }
}
