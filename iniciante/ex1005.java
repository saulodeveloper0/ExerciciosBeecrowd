import java.util.Scanner;

public class ex1005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A, B;
        A = input.nextDouble();
        B = input.nextDouble();
        double MEDIA = (A  * 3.5 + B * 7.5) / (3.5 + 7.5);
        System.out.printf("MEDIA = %.5f\n", MEDIA);

    }
}