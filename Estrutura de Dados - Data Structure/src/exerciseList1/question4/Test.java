package exerciseList1.question4;

public class Test {
    public static void main(String[] args) {
        Rational racionais = new Rational();
        racionais.insertRational(-3,-3);
        racionais.add();
        racionais.multiply();
        racionais.testEquality();

        System.out.println("_________________________________");

        Rational racionais2 = new Rational();
        racionais2.insertRational(6.4,8.7);
        racionais2.add();
        racionais2.multiply();
        racionais2.testEquality();
    }
}
