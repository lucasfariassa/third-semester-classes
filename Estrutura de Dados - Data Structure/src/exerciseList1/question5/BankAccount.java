package exerciseList1.question5;

import java.util.Scanner;

public class BankAccount implements BankAccountData {
    private double balance, value;
    Scanner scanner = new Scanner(System.in);

    public BankAccount() {
        int[] accounts = new int[1];
        balance = 0;
        System.out.println("Conta criada com sucesso!");
        seeBalance();
    }

    public void seeBalance() {
        System.out.println("Seu saldo é: R$" + balance);
    }

    public void deposit() {
        System.out.println("Digite o valor a ser depositado: ");
        value = Double.parseDouble(scanner.nextLine());
        System.out.println("Valor depositado com sucesso!");
        updateBalance();
    }

    public void withdraw() {
        System.out.println("Digite o valor a ser sacado: ");
        value = Double.parseDouble(scanner.nextLine());
        value = -value;
        System.out.println("Saque realizado com sucesso!");
        updateBalance();
    }

    public void updateBalance() {
        balance += value;
    }
}
