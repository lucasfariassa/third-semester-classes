package exerciseList1.question6;

import java.util.ArrayList;
import java.util.Scanner;

public class Phonebook implements PhonebookData {
    private final ArrayList<String> numbers;
    private String numero;
    private int n;
    Scanner scanner = new Scanner(System.in);

    public Phonebook() {
        numbers = new ArrayList<>();
        n = 0;
    }

    public void addPhoneNumber() {
        System.out.println("Digite o número que deseja adicionar na agenda: ");
        numero = scanner.nextLine();
        numbers.add(numero);
        System.out.println("Número adicionado: (" + numbers.get(n) + ")");
        n++;
    }

    public void deletePhoneNumber() {
        System.out.println("Digite o número que deseja apagar da agenda: ");
        numero = scanner.nextLine();
        numbers.remove(numero);
        System.out.println("Número removido! (" + numero + ")");
    }

    public void editPhoneNumber() {
        System.out.println("Digite o número que você deseja editar: ");
        numero = scanner.nextLine();
        System.out.println("Digite o novo número: ");
        String numeroEdit = scanner.nextLine();
        numbers.remove(numero);
        numbers.add(numeroEdit);
        System.out.println("Número alterado! (" + numeroEdit + ")");
    }
}
