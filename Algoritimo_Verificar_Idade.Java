import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
	    
		System.out.println("Digite seu nome");
		String nome = scanner.nextLine();
        
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        if (idade >= 65)
        {
            System.out.println("idoso");
        }
        else if (idade <18)
        {
            System.out.println("Menor de Idade");
        } 
        else{
            System.out.println("Maior de Idade");
        }
    
	}
}