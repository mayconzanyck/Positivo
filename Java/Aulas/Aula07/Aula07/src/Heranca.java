/*
oq é herança?
é o mecanismo de POO que permite um classe herdar atributos e metodos de outra.
Exemplo: Suponha que voce tenha uma classe Pessoa.
Varias classes como Aluno, Professor tem coisas em comum com pessoa.
Em vez de repetir tudo, essas classes herdam oq pessoa ja tem. 
*/

import java.util.Scanner;

class Pessoa{
    String nome;
    int idade;

    void apresentar(){
        System.out.println("Meu nome é " + nome);
        System.out.println("Tenho " + idade + " anos.");
    }
}

class Aluno extends Pessoa{
    String curso;

    void estudar(){
        System.out.println(nome + " esta estudando " + curso + ".");
    }
}

class Professor extends Pessoa{
    String disciplina;

    void lecionar(){
        System.out.println(nome + " esta lecionando " + disciplina + ".");
    }
}

public class Heranca{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Dados do aluno
        Aluno aluno = new Aluno();
        System.out.println("Digite o nome do aluno: ");
        aluno.nome = scanner.nextLine();

        System.out.println("Digite a idade do aluno: ");
        aluno.idade = scanner.nextInt();

        //limpar o buffer
        scanner.nextLine();

        System.out.println("Digite o curso do aluno: ");
        aluno.curso = scanner.nextLine();

        aluno.apresentar();
        aluno.estudar();

        System.out.println("\n-------------------------------\n");

        //Dados do professor
        Professor professor = new Professor();
        System.out.println("Digite o nome do professor: ");
        professor.nome = scanner.nextLine();

        System.out.println("Digite a idade do professor: ");
        professor.idade = scanner.nextInt();

        //limpar o buffer
        scanner.nextLine();

        System.out.println("Digite a disciplina do professor: ");
        professor.disciplina = scanner.nextLine();

        professor.apresentar();
        professor.lecionar();

        scanner.close();
    }
}