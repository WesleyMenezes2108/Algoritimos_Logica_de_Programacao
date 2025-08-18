import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o cargo: ");
        int codigoCargo = scanner.nextInt();
        
        System.out.print("Digite o salario (R$): ");
        String salarioStr = scanner.next().replace(",", ".");
        BigDecimal salario = new BigDecimal (salarioStr);
        scanner.close();
        
        switch (codigoCargo){
            case 1:
                System.out.println("1 - Serviçõs Gerais");
                BigDecimal salario1 = new BigDecimal(salarioStr);
                BigDecimal percentual1 = new BigDecimal("0.50");
                BigDecimal aumento1 = salario.multiply(percentual1);
                BigDecimal reajuste1 = salario.add(aumento1);
                System.out.println("O aumento é de: R$ "+ aumento1);
                System.out.println("O novo salario é de: R$ "+ reajuste1);
                break;
            
            case 2:
                System.out.println("2 - Vigia");
                BigDecimal salario2 = new BigDecimal(salarioStr);
                BigDecimal percentual2 = new BigDecimal("0.30");
                BigDecimal aumento2 = salario.multiply(percentual2);
                BigDecimal reajuste2 = salario.add(aumento2);
                System.out.println("O aumento é de: R$ "+ aumento2);
                System.out.println("O novo salario é de: R$ "+ reajuste2);
                break;
                
            case 3:
                System.out.println("3 - Recepcionista");
                BigDecimal salario3 = new BigDecimal(salarioStr);
                BigDecimal percentual3 = new BigDecimal("0.25");
                BigDecimal aumento3 = salario.multiply(percentual3);
                BigDecimal reajuste3 = salario.add(aumento3);
                System.out.println("O aumento é de: R$ "+ aumento3);
                System.out.println("O novo salario é de: R$ "+ reajuste3);
                break;
                
            case 4:
                System.out.println("4 - Vendedor");
                BigDecimal salario4 = new BigDecimal(salarioStr);
                BigDecimal percentual4 = new BigDecimal("0.15");
                BigDecimal aumento4 = salario.multiply(percentual4);
                BigDecimal reajuste4 = salario.add(aumento4);
                System.out.println("O aumento é de: R$ "+ aumento4);
                System.out.println("O novo salario é de: R$ "+ reajuste4);
                break;
        }
    }
}
