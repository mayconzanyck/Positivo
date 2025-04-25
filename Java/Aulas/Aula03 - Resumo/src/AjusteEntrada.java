import java.util.Scanner;

public class AjusteEntrada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número decimal(use , ou .): ");
        String entrada = scanner.nextLine().replace(",", ".");

        double numero = Double.parseDouble(entrada);
        System.out.println("Numero Digitados: " + numero);

        scanner.close();
    }

}