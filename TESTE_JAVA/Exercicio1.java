//Avaliação básica de conhecimento Java: Atividade 01.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de dias trabalhados:");
        int diasTrabalhados = Integer.parseInt(scanner.next());

        System.out.println("Digite a distância percorrida de ida e volta em (Km):");
        double distanciaPercorrida = Double.parseDouble(scanner.next().replace(",", "."));

        System.out.println("Digite o valor do combustível (por litro) em (R$):");
        double valorCombustivel = Double.parseDouble(scanner.next().replace(",", "."));

        System.out.println("Digite a média que o veículo faz (Km por litro):");
        double mediaVeiculo = Double.parseDouble(scanner.next().replace(",", "."));

        double distanciaTotal = distanciaPercorrida * diasTrabalhados;
        double consumoLitros = distanciaTotal / mediaVeiculo;
        double gastoReais = consumoLitros * valorCombustivel;

        System.out.printf("O consumo total em Litros: %.2f\n", consumoLitros);
        System.out.printf("O gasto total neste mês em Reais é de: R$ %.2f\n", gastoReais);
    }
}