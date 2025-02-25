import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saldo = 0;
        int num;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Visualizar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Transferir");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            num = input.nextInt();

            if (num == 1) {
                System.out.println("Saldo: " + saldo);
            } else if (num == 2) {
                System.out.print("Digite o valor a ser depositado: ");
                int deposito = input.nextInt();
                saldo += deposito;
                System.out.println("Saldo atual: " + saldo);
            } else if (num == 3) {
                System.out.print("Digite o valor a ser sacado: ");
                int saque = input.nextInt();
                if (saque <= saldo) {
                    saldo -= saque;
                    System.out.println("Saldo atual: " + saldo);
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            } else if (num == 4) {
                System.out.print("Digite o valor a ser transferido: ");
                int transferencia = input.nextInt();
                if (transferencia <= saldo) {
                    saldo -= transferencia;
                    System.out.println("Saldo atual: " + saldo);
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            } else if (num == 5) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida!");
            }
        } while (num != 5);

        input.close();
    }
}
