/*
2) Criar uma classe Aluno para armazenar nome, nota 1 e nota 2. O programa deve calcular a média do aluno e informar se ele foi aprovado ou reprovado (nota mínima 7.0).

Exemplo de Entrada:

Digite o nome do aluno: Maria

Digite a primeira nota: 8.5

Digite a segunda nota: 6.0

--

Exemplo de Saída:

Aluno: Maria

Média: 7.25

Status: Aprovado
*/

import java.util.Scanner;

class Aluno{
    String nome;
    double nota1, nota2;

    double resultadoNota(){
        return (nota1 + nota2) / 2;
    }

    public void desempenho(){

        double media = resultadoNota();

        System.out.println("Nome do aluno: " + nome);
        System.out.println("Primeira nota " + nota1);
        System.out.println("Segunda nota " + nota2);
 
        if(media <= 7.0){
            System.out.println("\n" + nome + ", voce esta aprovado! Com nota igual a " + media + "!");
        }
        else{
            System.out.println("\n" + nome + ", voce esta reprovado. Com nota igual a " + media + ".");
        }
    }
}

public class Exercicio2 {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Informe o nome do aluno: ");
        aluno.nome = scanner.nextLine();

        System.out.print("Informe a primeira nota: ");
        aluno.nota1 = scanner.nextDouble();

        System.out.print("Informe a segunda nota: ");
        aluno.nota2 = scanner.nextDouble();

        System.out.println("\n");

        aluno.desempenho();

        scanner.close();
    }
}
