//Outro exemplo de herança
import java.util.Scanner;


//Classe mae (super classe) que sera estendida por outra
class Pessoa{

    //atributos protected: acessiveis pelas subclasses diretamente
    protected String nome;
    protected int idade;

    //Construtor que inicializa nome e idade
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar(){
        System.out.println("Sou " + nome + ", tenho " + idade + " anos.");
    }
}

//Funcionarios herda de Pessoa (superclasse)
class Funcionario extends Pessoa{

    protected double salario;

    //Construtor da subclasse chama o construtor da subclasse com super()
    public Funcionario(String nome, int idade, double salario){

        super(nome, idade);
        this.salario = salario;
    }
    
    //sobrescrita de metodo: altera o comportamento de apresentar()
    @Override
    public void apresentar(){
        super.apresentar();//chama o metodo da subclasse para reaproveitar o codigo
        System.out.println("Sou um funcionario e meu salario é R$" + salario);
    }
}

class Gerente extends Funcionario{

    private String setor;

    //Construtor que tambem chama o construtor da superclasse Funcionario
    public Gerente(String nome, int idade, double salario, String setor){
        super(nome, idade, salario);//chamada em cadeia: Gerente -> Funcionario -> Pessoa
        this.setor = setor;
    }

    //Sobrescrita novamente do metodo apresentar()
    @Override
    public void apresentar(){

        super.apresentar();//chama apresentar() de Funcionario
        System.out.println("Atuo como gerente de setor de " + setor);
    }
}

//MAIN
public class Heranca2{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //entrada de dados para criar o objeto Gerente
        System.out.println("Digite o nome do gerente: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite o salario: ");
        double salario = scanner.nextDouble();

        scanner.nextLine();//limpa o buffer

        System.out.println("Digite o setor: ");
        String setor = scanner.nextLine();

        //inicia um objeto da subclasse Gerente 
        Gerente gerente = new Gerente(nome, idade, salario, setor);

        System.out.println("\n=== APRESENTAÇÃO ===");

        //chama o metodo apresentar() da classe Gerente
        gerente.apresentar();
        scanner.close();
    }
}