import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt();
        
        exibirTabuada(numero);
        
        scanner.close();
    }
    
    public static void exibirTabuada(int numero) {
        System.out.println("\nTabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}