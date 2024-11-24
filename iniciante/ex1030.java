import java.io.IOException;
import java.util.Scanner;

public class ex1030 {
    public static void main(String[] args) throws IOException {
        Scanner dado = new Scanner(System.in);
        int NC = dado.nextInt(); // Número de casos de teste

        for (int i = 1; i <= NC; i++) {
            int n = dado.nextInt(); // Número de pessoas no círculo
            int k = dado.nextInt(); // Passo para eliminar pessoas

            // Chama a versão iterativa da função josefo
            System.out.println("Case " + i + ": " + josefoIterativo(n, k));
        }

        dado.close(); // Fecha o Scanner
    }

    public static int josefoIterativo(int n, int k) {
        int posicao = 0; // Inicializa com 0 para o caso base (n = 1)
        for (int i = 2; i <= n; i++) {
            posicao = (posicao + k) % i;
        }
        return posicao + 1; // Ajusta para posições baseadas em 1
    }
}
