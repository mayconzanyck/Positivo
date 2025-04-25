import java.util.Random;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;

        int palpite = 0;
        boolean acertou = false;

        while (!acertou) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou!");
                acertou = true;
            } else if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo! Tente um número maior.");
            } else {
                System.out.println("Muito alto! Tente um número menor.");
            }
        }

        scanner.close();
    }
}
