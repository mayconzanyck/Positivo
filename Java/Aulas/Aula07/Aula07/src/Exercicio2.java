import java.util.Scanner;

// Classe base Funcionario
class Funcionario {
    String nome;
    double salario;
    
    void exibirDados() {
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário base: R$" + salario);
    }
}

// Subclasse Gerente
class Gerente extends Funcionario {
    double bonus;
    
    double calcularSalarioTotal() {
        return salario + bonus;
    }
}

// Subclasse Assistente
class Assistente extends Funcionario {
    String turno;
    
    void mostrarTurno() {
        System.out.println("Turno de trabalho: " + turno);
    }
}

// Classe principal
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Cadastro do Gerente
        System.out.println("=== Cadastro do Gerente ===");
        Gerente gerente = new Gerente();
        
        System.out.print("Nome: ");
        gerente.nome = scanner.nextLine();
        
        System.out.print("Salário base: ");
        gerente.salario = scanner.nextDouble();
        
        System.out.print("Bônus: ");
        gerente.bonus = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha
        
        System.out.println();
        gerente.exibirDados();
        System.out.println("Salário total com bônus: R$" + gerente.calcularSalarioTotal());
        
        System.out.println();
        
        // Cadastro do Assistente
        System.out.println("=== Cadastro do Assistente ===");
        Assistente assistente = new Assistente();
        
        System.out.print("Nome: ");
        assistente.nome = scanner.nextLine();
        
        System.out.print("Salário base: ");
        assistente.salario = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha
        
        System.out.print("Turno: ");
        assistente.turno = scanner.nextLine();
        
        System.out.println();
        assistente.exibirDados();
        assistente.mostrarTurno();
        
        scanner.close();
    }
}