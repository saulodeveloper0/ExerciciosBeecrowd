import java.util.Scanner;

public class ex1007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B, C, D;
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();
        int DIFERENCA = (A * B - C * D);
        System.out.printf("DIFERENCA = " + DIFERENCA);

    }
}