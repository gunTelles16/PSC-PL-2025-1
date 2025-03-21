import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número qualquer:");
        int i;
        int n = teclado.nextInt();

        /* for (i = 1 ;i <= n; i++) { // Equanto i for <= n, o contador percorrerá todos os números até n.
        *   for (int j = 1; j <= 10; j++) { // 
        *       System.out.println(i + "x" + j + "=" +  i*j);
        *   }
        * }
        */
        
        for (i = 0; i <= 10; i++) {
            System.out.println(i * n);
        }
    }
}
