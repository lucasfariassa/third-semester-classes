package class3.recursion;

public class Fibonacci {
    public int fibonacci(int x) {
        if (x==0 || x == 1) {
            return x;
        } else {
            return fibonacci(x-1)+fibonacci(x-2);
        }
    }
}
