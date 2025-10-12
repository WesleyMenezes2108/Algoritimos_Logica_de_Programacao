//Avaliação básica de conhecimento Java: Atividade 02.

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    static class Associado {
        String nome;
        int numeroAssociado;
        String sexo;
        double altura;
        double salario;
        int numeroFilhos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Associado> associados = new ArrayList<>();

        System.out.println("Quantos associados participaram do senso?");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\n********** Cadastro do associado " + i + " **********");
            Associado associado = new Associado();

            System.out.println("Digite o nome do associado: ");
            associado.nome = scanner.nextLine();
            
            associado.numeroAssociado = -1;
            while (associado.numeroAssociado <= 0){
                System.out.println("Digite o número do associado: ");
                associado.numeroAssociado = scanner.nextInt();
                scanner.nextLine();
                if (associado.numeroAssociado <= 0){
                    System.out.println("Número do associado deve ser maior que zero.\n"); 
                }
            }

            while (true){
                System.out.println("Digite o sexo do associado (M/F): ");
                associado.sexo = scanner.nextLine().toUpperCase();
                if (associado.sexo.equals("M") || associado.sexo.equals("F")) {
                    break;
                } else {
                    System.out.println("Informação inválida! Digite apenas M ou F.\n");
                }
            }

            associado.altura = -1;
            while (associado.altura <= 0){
                System.out.println("Digite a altura do associado: ");
                associado.altura = Double.parseDouble(scanner.nextLine().replace(",", "."));
                if (associado.altura <= 0){
                    System.out.println("Altura deve ser maior que zero!\n"); 
                }
            }

            associado.salario = -1;
            while (associado.salario < 0) {
                System.out.println("Digite o salário do associado: ");
                associado.salario = Double.parseDouble(scanner.nextLine().replace(",", "."));
                if (associado.salario < 0) {
                    System.out.println("Salário não pode ser negativo.\n");
                }
            }

            associado.numeroFilhos = -1;
            while (associado.numeroFilhos < 0) {
                System.out.println("Digite o número de filhos do associado: ");
                associado.numeroFilhos = Integer.parseInt(scanner.nextLine());
                if (associado.numeroFilhos < 0) {
                    System.out.println("Número de filhos não pode ser negativo.\n");
                }
            }

            associados.add(associado);
            
            System.out.println("\nCadastro concluído. Total de associados: " + associados.size() + "\n");
        }
        
        int opcao;

        do {
            System.out.println("\n==============================================");
            System.out.println("************* Menu de Relatórios *************");
            System.out.println("1 - Lista de Associados ");
            System.out.println("2 - Média da Altura dos Associados");
            System.out.println("3 - Total de Dependentes");
            System.out.println("4 - Quantidade de Homens e Mulheres + Porcentagem");
            System.out.println("5 - Maior Salário e Nome(s) do(s) Associado(s)");
            System.out.println("0 - Encerrar o Programa");
            System.out.println("==============================================");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Lista de Sócios ---");
                    for (Associado a : associados) {
                        System.out.println("Nome: " + a.nome);
                        System.out.println("Sexo: " + a.sexo);
                        System.out.println("Altura: %.2f" + a.altura);
                        System.out.println("Salário: %.2f" + a.salario);
                        System.out.println("Filhos: " + a.numeroFilhos);
                        System.out.println("----------------------------------------------");
                    }
                    break;
                    
                case 2:
                    double somaAltura = 0;
                    for (Associado a : associados) {
                        somaAltura += a.altura;
                    }
                    double mediaAltura = associados.size() > 0 ? somaAltura / associados.size() : 0;
                    System.out.printf("Média da altura dos associados: %.2f\n\n", mediaAltura);
                    break;

                case 3:
                    int totalFilhos = 0;
                    for (Associado a : associados) {
                        totalFilhos += a.numeroFilhos;
                    }
                    System.out.println("Total de dependentes: " + totalFilhos + "\n");
                    break;

                case 4:
                    int homens = 0, mulheres = 0;
                    for (Associado a : associados) {
                        if (a.sexo.equals("M")) homens++;
                        else if (a.sexo.equals("F")) mulheres++;
                    }
                    int total = associados.size();
                    double percHomens = total > 0 ? (homens * 100.0 / total) : 0;
                    double percMulheres = total > 0 ? (mulheres * 100.0 / total) : 0;
                    System.out.println("Homens: " + homens + " (" + String.format("%.2f", percHomens) + "%)");
                    System.out.println("Mulheres: " + mulheres + " (" + String.format("%.2f", percMulheres) + "%)\n");
                    break;

                case 5:
                    double maiorSalario = 0;
                    for (Associado a : associados) {
                        if (a.salario > maiorSalario) {
                            maiorSalario = a.salario;
                        }
                    }
                    System.out.printf("Maior salário: %.2f\n", maiorSalario);
                    System.out.println("Associado(s) com maior salário:");
                    for (Associado a : associados) {
                        if (a.salario == maiorSalario) {
                            System.out.println("- " + a.nome);
                        }
                    }
                    System.out.println();
                    break;
        
                case 0:
                    System.out.println("\nEncerrando o programa...");
                    break;
        
                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
                    break;
            }
        
        } while (opcao != 0);

        scanner.close();
    }
}
