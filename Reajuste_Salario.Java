import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o cargo: ");
        int codigoCargo = scanner.nextInt();

        System.out.print("Digite o salário (R$): ");
        String salarioStr = scanner.next().replace(",", ".");
        BigDecimal salario = new BigDecimal(salarioStr);
        scanner.close();

        switch (codigoCargo) {
            case 1:
                System.out.println("1 - Serviços Gerais");
                aplicarReajuste(salario, new BigDecimal("0.50"));
                break;
            case 2:
                System.out.println("2 - Vigia");
                aplicarReajuste(salario, new BigDecimal("0.30"));
                break;
            case 3:
                System.out.println("3 - Recepcionista");
                aplicarReajuste(salario, new BigDecimal("0.25"));
                break;
            case 4:
                System.out.println("4 - Vendedor");
                aplicarReajuste(salario, new BigDecimal("0.15"));
                break;
            default:
                System.out.println("Código de cargo inválido.");
        }
    }

    public static void aplicarReajuste(BigDecimal salario, BigDecimal percentual) {
        BigDecimal aumento = salario.multiply(percentual);
        BigDecimal novoSalario = salario.add(aumento);
        System.out.println("O aumento é de: R$ " + aumento);
        System.out.println("O novo salário é de: R$ " + novoSalario);
    }
}
