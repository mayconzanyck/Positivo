import java.util.Scanner;

// Classe base Veiculo
class Veiculo {
    String marca;
    int ano;
    
    void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
}

// Subclasse Carro
class Carro extends Veiculo {
    int portas;
    
    void abrirPortas() {
        System.out.println("Abrindo todas as portas...");
    }
}

// Subclasse Moto
class Moto extends Veiculo {
    boolean temPartidaEletrica;
    
    void empinar() {
        System.out.println("Empinando a moto!");
    }
}

// Classe principal
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criando um carro
        System.out.print("Digite a marca do carro: ");
        Carro carro = new Carro();
        carro.marca = scanner.nextLine();
        
        System.out.print("Digite o ano: ");
        carro.ano = scanner.nextInt();
        
        System.out.print("Digite o número de portas: ");
        carro.portas = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        
        // Exibindo os dados do carro
        System.out.println();
        carro.exibirDados();
        System.out.println("Este carro tem " + carro.portas + " portas.");
        carro.abrirPortas();
        
        System.out.println();
        
        // Criando uma moto
        System.out.print("Digite a marca da moto: ");
        Moto moto = new Moto();
        moto.marca = scanner.nextLine();
        
        System.out.print("Digite o ano: ");
        moto.ano = scanner.nextInt();
        
        System.out.print("A moto tem partida elétrica? (true/false): ");
        moto.temPartidaEletrica = scanner.nextBoolean();
        
        // Exibindo os dados da moto
        System.out.println();
        moto.exibirDados();
        System.out.println("A moto " + (moto.temPartidaEletrica ? "tem" : "não tem") + " partida elétrica.");
        moto.empinar();
        
        scanner.close();
    }
}