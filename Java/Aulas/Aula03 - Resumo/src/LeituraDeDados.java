import java.util.Scanner;

public class LeituraDeDados {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int inteiro = scanner.nextInt();

        System.out.print("Digite um numero decimal: ");
        double decimal = scanner.nextDouble();

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.next();
        // Le apenas a primeira palavra;

        scanner.nextLine();

        System.out.print("Digite uma frase completa: ");
        String frase = scanner.nextLine();

        System.out.println("\n === Dados Lidos ===");
        System.out.println("Numero inteiro: " + inteiro);
        System.out.println("Numero decimal: " + decimal);
        System.out.println("Palavra: " + palavra);
        System.out.println("Frase completa: " + frase);

        scanner.close();
    }
}


