package exerciseList1.question4;

public class Rational implements RationalData {
    private final double[] rational;
    private int n;

    public Rational() {
        rational = new double[2];
        n = 0;
    }

    public void insertRational(double rational1, double rational2) {
        rational[n++] = rational1;
        rational[n++] = rational2;
    }

    public void add() {
        double result = rational[0] + rational[1];
        System.out.println(rational[0] + " + " + rational[1] + " = " + result);
    }
    public void multiply() {
        double result = rational[0] * rational[1];
        System.out.println(rational[0] + " * " + rational[1] + " = " + result);
    }
    public void testEquality() {
        double number1 = rational[0];
        double number2 = rational[1];
        if (number1 == number2) {
            System.out.println("Os números " + number1 + " e " + number2 + " são iguais");
        } else {
            System.out.println("Os números " + number1 + " e " + number2 + " NÃO são iguais");
        }
    }
}
