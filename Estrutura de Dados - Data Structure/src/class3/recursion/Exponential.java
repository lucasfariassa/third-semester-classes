package class3.recursion;

public class Exponential {
    public int exponential(int x, int y) {
        if (y == 0) {
            return 1;
        }

        // x -> o número base - the base number
        // y -> o expoente -  the exponent

        int e = exponential(x, y/2);

        if (y % 2 == 0) {
            return e*e;
        } else {
            return x*e*e;
        }
    }
}
