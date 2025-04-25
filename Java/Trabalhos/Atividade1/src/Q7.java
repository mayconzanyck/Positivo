import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do saque: ");
        int valor = scanner.nextInt();

        System.out.println("Notas de 100: " + valor / 100);
        valor = valor % 100;

        System.out.println("Notas de 50: " + valor / 50);
        valor = valor % 50;

        System.out.println("Notas de 20: " + valor / 20);
        valor = valor % 20;

        System.out.println("Notas de 10: " + valor / 10);
        valor = valor % 10;

        System.out.println("Notas de 5: " + valor / 5);
        valor = valor % 5;

        System.out.println("Notas de 2: " + valor / 2);
        valor = valor % 2;

        System.out.println("Notas de 1: " + valor / 1);

        scanner.close();
    }
}
