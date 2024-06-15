import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agencia");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Titular");
        String titular = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+titular+", obrigado por criar uma conta em nosso banco, sua agência é"+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }

}