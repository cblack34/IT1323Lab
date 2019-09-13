public class Main {

    public static void main(String[] args) {
	    Vendor[] vendors = new Vendor[2];

        for (int i = 0; i < vendors.length; i++) {
            System.out.println(String.format("\n\nProcessing Vendor %d\n===================================\n\n", i+1));
            vendors[i] = new Vendor(i+1, String.format("KSU Vendor %d", i));

            System.out.println(vendors[i]);

            vendors[i].setName(String.format("KSU Vendor %d", i+10));
            for (int j = 1; j <= 4; j++) {
                vendors[i].setQuarterlyPurchaseOrderTotal(j, ((int) (Math.random()*10000))/100.0);
            }

            System.out.println(String.format("Vendor Name: %s", vendors[i].getName()));
            System.out.println(String.format("Vendor ID: %d", vendors[i].getID()));
            System.out.println(String.format("First quarter PO Totals: $%.2f", vendors[i].getQuarterlyPurchaseOrderTotal(1)));
            System.out.println(String.format("Yearly PO total: %.2f", vendors[i].sumQuarterlyPurchaseOrderTotals()));
        }

        System.out.println("\n\n==================================================\n\n");

        for (Vendor vendor : vendors) {
            System.out.println(vendor);
            System.out.println("==============================\n");
        }
    }
}
