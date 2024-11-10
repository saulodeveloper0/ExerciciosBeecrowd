import java.util.Scanner;

public class ex1006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A, B, C;
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();
        double MEDIA = (A  * 2 + B * 3 + C * 5) / (2 + 3 + 5);
        System.out.printf("MEDIA = %.1f\n", MEDIA);

    }
}