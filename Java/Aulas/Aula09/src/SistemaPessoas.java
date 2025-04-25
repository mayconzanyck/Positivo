//POLIMORFISMO
//Polimorfismo significa literalmente "muitas formas"
// Um mesmo metodo pode ter comportamentos diferentes,
//dependendo do objeto que o chama.
// Chegamos a  ver um polimorfismo na aula passada
//Vamos fazer um Exemplo mais completo com polimorfismo

import java.util.Scanner;
import java.util.ArrayList;

class Pessoa {
    protected String nome;

    public Pessoa (String nome){
        this.nome=nome;
    }

    public void apresentar(){
        System.out.println("Olá , sou uma pessoa genérica.");
    }
}

class Aluno extends Pessoa{
    public Aluno(String nome){
        super(nome);

    }
    @Override
    public void apresentar(){
        System.out.println("Olá , sou o aluno " + nome + ".");
    }
}

class Professor extends Pessoa {
    public Professor (String nome){
        super(nome);
    }

    @Override
    public void apresentar(){
        System.out.println("Olá , sou o professor " + nome + ".");
    }
}

public class SistemaPessoas {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastra Professor");
            System.out.println("3 - Exibir apresentacoes");
            System.out.println("4 - Sair");
            System.out.println("5 - Mostrar total de alunos e professores");
            System.out.println("Escolha uma opcão");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                System.out.print("Digite o nome do aluno: ");
                String nomeAluno = scanner.nextLine();
                pessoas.add( new Aluno(nomeAluno));
                System.out.println("Aluno cadastrado com sucesso!");
                    
                    break;
                case 2:
                System.out.print("Digite o nome do professor: ");
                String nomeProf = scanner.nextLine();
                pessoas.add( new Professor(nomeProf));
                System.out.println("Professor cadastrado com sucesso!");
            
                    break;

                case 3 :
                System.out.println("\n=== APRESENTAÇOES ===");
                for (Pessoa p : pessoas){
                    p.apresentar();
                }
                    break;

                case 4 :
                    System.out.println("Encerrar programa");

                    break;

                case 5 :
                int totalAlunos = 0;
                int totalProfessores = 0 ;
                for (Pessoa p : pessoas){
                    if (p instanceof Aluno){
                        totalAlunos++;
                    } else if ( p instanceof Professor){
                        totalProfessores ++;

                    }
                }
                 System.out.println( " TOTAL DE ALUNO: " + totalAlunos);
                 System.out.println( " TOTAL DE PROFESSORES: " +totalProfessores);
                break ;

                default:
                   System.out.println(" Opcao invalida.");
            }
            }while (opcao != 4);
                
            scanner.close();
        }
    }
