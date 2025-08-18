import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        if (idade < 16)
        {
            System.out.println("Não Eleitor");
        }
        else if ((idade > 65 ) || (idade < 18))
        {
            System.out.println("Eleitor Facultativo");
        } 
        else{
            System.out.println("Eleitor Obrigatório");
        }
    
	}
}