import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            numeros.add(scanner.nextInt());
        }

        int maior = numeros.get(0);
        int menor = numeros.get(0);
        
        for (int num : numeros) {
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        scanner.close();
    }
}