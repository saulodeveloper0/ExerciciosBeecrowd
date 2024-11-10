import java.util.Locale;
import java.util.Scanner;

public class ex1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int codigoPeca1 = input.nextInt();
        int quantidadePeca1 = input.nextInt();
        Double valorUnitario1 = input.nextDouble();

        int codigoPeca2 = input.nextInt();
        int quantidadePeca2 = input.nextInt();
        Double valorUnitario2 = input.nextDouble();

        Double valorTotalPagar = ((valorUnitario1 * quantidadePeca1) + (valorUnitario2 * quantidadePeca2));

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotalPagar);

    }
}