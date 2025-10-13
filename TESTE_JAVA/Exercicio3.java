//Avaliação básica de conhecimento Java: Atividade 02.

//Avaliação básica de conhecimento Java: Atividade 03. 

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    static class Pessoa{
        int id;
        String nome;
        int idade;
        double altura;
        double peso;
        
        double IMC() {
            return peso / (altura * altura);
        }
    }
    
    
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    ArrayList<Pessoa> pessoas = new ArrayList<>();
	    
        System.out.println("===== CADASTRO DE PESSOAS =====\n");
       
        while(true){
            Pessoa pessoa = new Pessoa();
            
            System.out.println("Digite o ID: (Digite 0 para encerrar!) ");
            pessoa.id = scanner.nextInt();
            scanner.nextLine();
            if(pessoa.id == 0){
                System.out.println("\nCadastro encerrado.\n");
                break;
            }
                    
            System.out.println("Digite o Nome: ");
            pessoa.nome = scanner.nextLine();
            while (pessoa.nome.trim().isEmpty()){
                System.out.println("O nome não pode estar vazio. Digite novamente:");
                pessoa.nome = scanner.nextLine();
            }
        
            System.out.println("Digite a idade: ");
            pessoa.idade = scanner.nextInt();
            while(pessoa.idade <= 0){
                System.out.println("A idade deve ser maior que zero. Digite novamente:");
                pessoa.idade = scanner.nextInt();
            }
            
            System.out.println("Digite a altura: ");
            pessoa.altura = Double.parseDouble(scanner.next().replace(",","."));
            while(pessoa.altura <= 0){
                System.out.println("A altura deve ser maior que zero. Digite novamente:");
                pessoa.altura = Double.parseDouble(scanner.next().replace(",","."));
            }
            
            System.out.println("Digite o peso: ");
            pessoa.peso =  Double.parseDouble (scanner.next().replace(",","."));
            while(pessoa.peso <= 0){
                System.out.println("O peso não pode estar vazio. Digite novamente:");
                pessoa.peso =  Double.parseDouble (scanner.next().replace(",","."));
                
            }
           
            pessoas.add(pessoa);  
            System.out.println("\n Pessoa cadastrada com sucesso!\n");
        } 
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
            return;
        }

        System.out.println("============================================================================");
        System.out.println("========================== RELATÓRIOS ======================================\n");
        
        //pessoas em ordem crescente de ID.
        for (int i = 0; i < pessoas.size() - 1; i++) {
            for (int j = 0; j < pessoas.size() - 1 - i; j++) {
                if (pessoas.get(j).id > pessoas.get(j + 1).id) {
                    Pessoa temp = pessoas.get(j);
                    pessoas.set(j, pessoas.get(j + 1));
                    pessoas.set(j + 1, temp);
                }
            }
        }
        System.out.println("Pessoas em ordem crescente de ID:");
        for (Pessoa p : pessoas) {
            System.out.printf("ID: %d | Nome: %s | Idade: %d | Altura: %.2f | Peso: %.2f | IMC: %.2f%n",
                    p.id, p.nome, p.idade, p.altura, p.peso, p.IMC());
        }

        System.out.println("============================================================================");
        
        //Pessoas em ordem decrescente por IMC.
        for (int i = 0; i < pessoas.size() - 1; i++) {
            for (int j = 0; j < pessoas.size() - 1 - i; j++) {
                if (pessoas.get(j).IMC() < pessoas.get(j + 1).IMC()) {
                    Pessoa temp = pessoas.get(j);
                    pessoas.set(j, pessoas.get(j + 1));
                    pessoas.set(j + 1, temp);
                }
            }
        }
        
        System.out.println("Pessoas em ordem decrescente de IMC:");
        for (Pessoa p : pessoas) {
            System.out.printf("Nome: %s | IMC: %.2f%n", p.nome, p.IMC());
        }
        System.out.println("============================================================================");
        
        //Pessoas em ordem crescente por altura.
        for (int i = 0; i < pessoas.size() - 1; i++) {
            for (int j = 0; j < pessoas.size() - 1 - i; j++) {
                if (pessoas.get(j).altura > pessoas.get(j + 1).altura) {
                    Pessoa temp = pessoas.get(j);
                    pessoas.set(j, pessoas.get(j + 1));
                    pessoas.set(j + 1, temp);
                }
            }
        }

        System.out.println("Pessoas em ordem crescente de altura:");
        for (Pessoa p : pessoas) {
            System.out.printf("Nome: %s | Altura: %.2f m%n", p.nome, p.altura);
        }
	    System.out.println("============================================================================");
	    
	    //Média geral
	    double somaIdade = 0, somaAltura = 0, somaPeso = 0, somaIMC = 0;

        for (Pessoa p : pessoas) {
            somaIdade += p.idade;
            somaAltura += p.altura;
            somaPeso += p.peso;
            somaIMC += p.IMC();
        }

        int total = pessoas.size();
        System.out.println("MÉDIAS GERAIS:");
        System.out.printf("Idade média: %.2f anos%n", somaIdade / total);
        System.out.printf("Altura média: %.2f m%n", somaAltura / total);
        System.out.printf("Peso médio: %.2f kg%n", somaPeso / total);
        System.out.printf("IMC médio: %.2f%n", somaIMC / total);

        System.out.println("============================================================================");
        System.out.println("\nPrograma finalizado com sucesso!");
        scanner.close();
	}   
	
}
