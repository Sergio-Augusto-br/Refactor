import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();
        
        double saldo = 0.0;
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo atual é: R$ %.2f\n", saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.printf("Depósito de R$ %.2f realizado com sucesso.\n", deposito);
                    } else {
                        System.out.println("Valor inválido.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor para saque: R$ ");
                    double saque = scanner.nextDouble();
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.printf("Saque de R$ %.2f realizado com sucesso.\n", saque);
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        System.out.println("Valor inválido.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo... Obrigado por usar o sistema!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
