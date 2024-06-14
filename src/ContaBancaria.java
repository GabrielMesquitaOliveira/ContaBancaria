import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double saldo = 0.00;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // : Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    Double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    // : Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    Double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    else{
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    // : Exibir o saldo atual da conta.
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}