import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double saldo = 2500;
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("******************************************************");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.println("******************************************************");
            opcao = leia.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo atual é de " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor que deseja depositar");
                double deposito = leia.nextDouble();
                saldo += deposito;
            } else if (opcao == 3) {
                System.out.println("Digite o valor que deseja sacar");
                double saque = leia.nextDouble();
                if (saque > saldo) {
                    System.out.println("Saldo Insuficiente!!");
                }
                saldo -= saque;
            } else if (opcao == 4) {
                System.out.println("Finalizando...");
            }
        }
    }
}
