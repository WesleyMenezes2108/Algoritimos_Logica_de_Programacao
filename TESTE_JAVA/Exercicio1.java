//Avaliação básica de conhecimento Java: Atividade 01.

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //Scanner e entradas do Usuario.
        System.out.print("Digite a quantidade de dias trabalhados: ");
        int diasTrabalhados = scanner.nextInt();

        System.out.print("Digite a distância percorrida de ida e volta (em Km): ");
        double distanciaPercorrida = scanner.nextDouble();

        System.out.print("Digite o valor do combustível (por litro) em R$: ");
        double valorCombustivel = scanner.nextDouble();

        System.out.print("Digite a média que o veículo faz (Km por litro): ");
        double mediaVeiculo = scanner.nextDouble();

        //validação para evitar valores negativos
        if (diasTrabalhados <= 0 || distanciaPercorrida <= 0 || valorCombustivel <= 0 || mediaVeiculo <= 0) {
            System.out.println("\nErro: todos os valores devem ser maiores que zero.");
            scanner.close();
            return;
        }
        //Calculos de distancia, consumo e gastos
        double distanciaTotal = distanciaPercorrida * diasTrabalhados;
        double consumoLitros = distanciaTotal / mediaVeiculo;
        double gastoReais = consumoLitros * valorCombustivel;

        //Relatorios e resultados
        System.out.printf("%n===== RESULTADOS =====%n");
        System.out.printf("Distância total percorrida: %.2f Km%n", distanciaTotal);
        System.out.printf("Consumo total: %.2f litros%n", consumoLitros);
        System.out.printf("Gasto total no mês: R$ %.2f%n", gastoReais);

        scanner.close();
    }
}
