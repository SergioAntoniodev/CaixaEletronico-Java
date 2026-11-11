import java.util.Scanner;

public class CaixaEletro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.00;

        System.out.println("CAIXA ELETRÔNICO");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair");

        System.out.print("Digite a opção desejada: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Saldo atual: R$ " + saldo);
                break;
            
            case 2:
                System.out.print("Digite o valor a ser depositado: ");
                double deposito = scanner.nextDouble();
                saldo += deposito;
                System.out.println("Deposito realizado com sucesso.");
                System.out.println("Saldo atual: R$ " + saldo);
                break;

            case 3:
                System.out.print("Digite o valor a ser sacado: ");
                double saque = scanner.nextDouble();
                if (saque <= saldo) {
                    saldo -= saque;
                    System.out.println("Saque realizado com sucesso.");
                    System.out.println("Saldo atual: R$ " + saldo);
                } else {
                    System.out.println("Saldo insuficiente para realizar o saque");
                }
                break;
            
            case 4:
                System.out.println("Saindo do Sistema...");
                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;

        }

    }
}
