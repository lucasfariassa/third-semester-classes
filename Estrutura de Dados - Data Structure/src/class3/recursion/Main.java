package class3.recursion;

// Aula sobre recursividade - Class about recursion
public class Main {
    public static void main(String[] args) {
        Factorial fa = new Factorial();
        int fato = fa.factorial(8); // define o número para ser calculado - set the number that will be calculated
        System.out.println("Fatorial: " + fato); // imprime o resultado - print the result of the factorial

        Fibonacci fi = new Fibonacci();
        int fibo = fi.fibonacci(10); // define o número limite - set the limit number of the Fibonacci sequence
        System.out.println("Fibonacci: " + fibo); // imprime o resultado - print the result of the Fibonacci

        Exponential ex = new Exponential();
        int expo = ex.exponential(2,9); // define os números que serão usados - set the numbers that will be used
        System.out.println("Exponencial: " + expo); // imprime o resultado - print the result of the exponential
    }
}
