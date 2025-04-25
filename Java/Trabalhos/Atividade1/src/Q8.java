import java.util.Scanner;

public class Q8 {

    public static int contarVogais(String palavra) {
        int contador = 0;
        
        palavra = palavra.toLowerCase();
        
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        
        int quantidadeVogais = contarVogais(palavra);
        System.out.println("A palavra contém " + quantidadeVogais + " vogais.");
        
        scanner.close();
    }
}
