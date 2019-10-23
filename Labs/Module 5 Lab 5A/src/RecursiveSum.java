import java.util.Arrays;

public class RecursiveSum {
    private int[] x;

    public RecursiveSum(int[] x) {
        setX(x);
    }

    public int[] getX() {
        return x.clone();
    }

    public void setX(int[] x) {
        this.x = x.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecursiveSum that = (RecursiveSum) o;
        return Arrays.equals(x, that.x);
    }

    @Override
    public String toString() {
        return "RecursiveSum{" +
                "x=" + Arrays.toString(x) +
                '}';
    }

//    public static int sum(int[] y){
//        int total = 0;
//        for (int i: y){
//            total = total + i;
//        }
//
//        return total;
//    }

    public int sum(int[] y){
       return this.sum(y, y.length-1);
    }

    public int sum(int[] y, int index){
        if (index == 0)
            return y[index];
        else
            return y[index] + sum(y, index-1);
    }
}
