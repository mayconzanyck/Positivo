import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int contadorPares = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("Quantidade de números pares: " + contadorPares);
        scanner.close();
    }
}
