import java.util.Scanner;

public class ex1026 {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        
        Long a = dado.nextLong();
        Long b = dado.nextLong();
        
        System.out.println(a ^ b);
        dado.close();
    }
}
