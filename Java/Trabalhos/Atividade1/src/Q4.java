import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;

        System.out.println("Digite as 5 notas do aluno:");
        for (int i = 0; i < 5; i++) {
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / 5;
        
        System.out.printf("Média: %.2f\n", media);
        System.out.println("Situação: " + (media >= 7.0 ? "Aprovado" : "Reprovado"));
        
        scanner.close();
    }
}