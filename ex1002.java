import java.util.Scanner;

public class ex1002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double PI = 3.14159;
        double raio = input.nextDouble();
        double A = PI * Math.pow(raio, 2);
        System.out.printf("A=%.4f\n",A);

    }
}