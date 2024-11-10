import java.util.Locale;
import java.util.Scanner;

public class ex1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        String nome = input.next();
        Double salario = input.nextDouble();
        Double montanteVendas = input.nextDouble();

        salario = salario + (montanteVendas * 0.15);
        System.out.printf("TOTAL = R$ %.2f%n", salario);
    }
}