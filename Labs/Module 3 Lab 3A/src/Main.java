/*
 * Name: Clayton Black
 * Date: 09-25-2019
 * Assignment Name: Module 3 Lab 3A
 * Assignment Brief: inheritance
 * Sources:
 *  - https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/Random.html
 */

import java.util.Arrays;
import java.util.Random;

public class Main {

	private static final String[] randomWords = {
			"Rare",
			"Thinker",
			"Shock",
			"Goal",
			"Stuff",
			"Soak",
			"Chair",
			"Ash",
			"Knot",
			"System"
	};

	private static final double[] taxRates = { .05, .06, .07, .08, .09, .1};

    public static void main(String[] args) {
	    Random r = new Random();
    	Store[] stores = new Store[3];

	    stores[0] = new Store();
	    stores[1] = new YarnStore();
	    stores[2] = new YarnStore();

	    for (Store store: stores){
			System.out.print("Pre Changes: ");
			System.out.println(store);

	    	String newName = randomWords[r.nextInt(randomWords.length)] + " " + randomWords[r.nextInt(randomWords.length)];
	    	store.setName(newName);

	    	store.setTaxRate(taxRates[r.nextInt(taxRates.length)]);

			System.out.println("Store Name: " + store.getName());
			System.out.println("Tax Rate: " + store.getTaxRate());

			if (store instanceof YarnStore){
				((YarnStore) store).setAvgPricePerSkein(r.nextInt(9)+1);
				((YarnStore) store).setSkeinsSoldPerYear(r.nextInt(90000) + 10000);

				System.out.println("Skeins Sold Per Year: " + ((YarnStore) store).getSkeinsSoldPerYear());
				System.out.println("Average Price Per Skein: " + ((YarnStore) store).getAvgPricePerSkein());
				System.out.println("Average Taxes Per Year: " + ((YarnStore) store).avgTaxesPerYear());
			}

			int s = r.nextInt(stores.length);
			System.out.printf("This store is the same as stores[%d]: %s\n", s, store.equals(stores[s]));

			System.out.print("Post Changes: ");
			System.out.println(store+ "\n");
        }
    }
}
