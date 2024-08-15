import java.util.Scanner;
import java.util.Arrays;

public class CalcularConsumo {

    // Função para calcular o consumo total de dados móveis
    public static int calcularConsumoTotal(int[] consumoSemanal) {
        int total = 0;

        //Calcule o consumo total de dados móveis
        total = Arrays.stream(consumoSemanal).sum();
        return total;
    }

    // Função para calcular a média semanal de consumo de dados móveis
    public static int calcularMediaSemanal(int totalConsumo, int numeroDeSemanas) {
        //: Calcule a média semanal de consumo de dados móveis
        int media = totalConsumo / numeroDeSemanas;
        return media;
    }

    // Função para identificar a semana de maior consumo
    public static String identificarSemanaDeMaiorConsumo(int[] consumoSemanal) {
        int maiorConsumo = consumoSemanal[0];
        int indiceMaiorConsumo = 0;
        for (int i = 0; i < consumoSemanal.length; i++) {
            if (consumoSemanal[i] > maiorConsumo) {
                maiorConsumo = consumoSemanal[i];
                indiceMaiorConsumo = i;
            }
        }
        return "Semana " + (indiceMaiorConsumo + 1);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de consumos semanais em MB
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] consumoSemanal = input.split(",");

        // Calculando o consumo total de dados móveis no mês

        int totalConsumo = calcularConsumoTotal(Arrays.stream(consumoSemanal).mapToInt(Integer::parseInt).toArray());

        // Calculando a média semanal de consumo de dados móveis
        int mediaSemanal = calcularMediaSemanal(totalConsumo, consumoSemanal.length);

        // Identificando a semana de maior consumo
        String MaiorConsumo = identificarSemanaDeMaiorConsumo(Arrays.stream(consumoSemanal).mapToInt(Integer::parseInt).toArray());

        // Exibindo o consumo total de dados móveis no mês
        System.out.println("Total mensal: " + totalConsumo + " MB");

        // Exibindo a média semanal de consumo
        System.out.println("Media semanal: " + mediaSemanal + " MB");

        // Exibindo a semana de maior consumo
        System.out.println("Maior consumo: " + MaiorConsumo);

        scanner.close();
    }
}