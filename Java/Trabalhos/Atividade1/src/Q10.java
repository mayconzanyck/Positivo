import java.util.Random;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha (par ou ímpar): ");
        String escolhaUsuario = scanner.nextLine().toLowerCase();

        System.out.print("Digite um número: ");
        int numeroUsuario = scanner.nextInt();

        Random random = new Random();
        int numeroComputador = random.nextInt(10) + 1;

        int soma = numeroUsuario + numeroComputador;

        String resultadoSoma = (soma % 2 == 0) ? "Par" : "Ímpar";

        System.out.println("Computador escolheu: " + numeroComputador);
        System.out.println("Soma: " + soma + " → " + resultadoSoma);

        if ((escolhaUsuario.equals("par") && resultadoSoma.equals("Par")) || 
            (escolhaUsuario.equals("ímpar") && resultadoSoma.equals("Ímpar"))) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Você perdeu!");
        }

        scanner.close();
    }
}
