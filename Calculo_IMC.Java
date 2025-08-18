import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (kg): ");
        String pesoStr = scanner.next().replace(",", ".");
        double peso = Double.parseDouble(pesoStr);

        System.out.print("Digite sua altura (cm): ");
        String alturaStr = scanner.next().replace(",", ".");
        double alturacm = Double.parseDouble(alturaStr);
        double altura = alturacm / 100;


        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc < 20) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc <= 25) {
            System.out.println("Classificação: Normal");
        } else if (imc <= 30) {
            System.out.println("Classificação: Excesso de peso");
        } else if (imc <= 35) {
            System.out.println("Classificação: Obesidade");
        } else {
            System.out.println("Classificação: Obesidade mórbida");
        }

        scanner.close();
    }
}
