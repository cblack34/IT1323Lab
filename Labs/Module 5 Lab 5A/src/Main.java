import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] input = {1, 2, 3, 4};

	    RecursiveSum adder = new RecursiveSum(input);

        System.out.println(adder);
        System.out.println(Arrays.toString(adder.getX()));
        System.out.println(adder.sum(adder.getX()));

        System.out.println("\nSet x to {5, 6, 7, 8}");
        adder.setX(new int[]{5, 6, 7, 8});
        System.out.println(adder);
        System.out.println(Arrays.toString(adder.getX()));
        System.out.println(adder.sum(adder.getX()));

        System.out.println("\n\nCreate 2 more RecursiveSum objects: adder2.x == {1, 2, 3, 4} and adder3.x == {1, 2, 3, 4}");
        RecursiveSum adder2 = new RecursiveSum(new int[]{1, 2, 3, 4});
        RecursiveSum adder3 = new RecursiveSum(new int[]{1, 2, 3, 4});

        System.out.println("\nadder  == adder2: " + adder.equals(adder2));
        System.out.println("adder  == adder3: " + adder.equals(adder3));
        System.out.println("adder2 == adder3: " + adder2.equals(adder3));
    }
}
