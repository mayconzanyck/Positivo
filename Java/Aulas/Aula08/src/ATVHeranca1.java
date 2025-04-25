//classe base

import java.util.Scanner;

class Transporte{

    protected String linha;
    protected String motorista;
    protected int quantidadePassageiros;

    //Construtor que inicializa
    public Transporte(String linha, String motorista, int quantidadePassageiros){
        
        this.linha = linha;
        this.motorista = motorista;
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public void iniciarViagem(){

        System.out.println("A viagem foi iniciada!");
        System.out.println("Com o motorista " + motorista + ".");
    }

    public void encerrarViagem(){
        
        System.out.println("Viagem encerrada!");
    }

    public void exibirDados(){
        
        System.out.println("A viagem foi realizada pela linha " + linha);
        System.out.println("Motorista da viagem: " + motorista);
        System.out.println("Haviam presentes " + quantidadePassageiros + " no onibus");
    }
}

//subclasse onibus
class Onibus extends Transporte{
    
    private String tipo;

    //Construtor da classe Transporte
    public Onibus(String linha, String motorista, int quantidadePassageiros, String tipo){

        super(linha, motorista, quantidadePassageiros);
        this.tipo = tipo;
    }

    public void abrirPortas(){
        System.out.println("Abrindo as portas!");
    }

    public void fecharPortas(){
        System.out.println("Fechando as portas.");
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Tipo do onibus: " + tipo);
    }
}

//subclasse metro
class Metro extends Transporte{

    private int numeroVagoes;

    //Construtor
    public Metro(String linha, String motorista, int quantidadePassageiros, int numeroVagoes){
        
        super(linha, motorista, quantidadePassageiros);
        this.numeroVagoes = numeroVagoes;
    }

    public void embarcarPassageiros(int quantidade){
        quantidadePassageiros += quantidade;
        System.out.println(quantidade + " passageiros embarcaram");
    }

    public void desembarcarPassageiros(int quantidade){
        if(quantidadePassageiros >= quantidade){
            quantidadePassageiros -= quantidade;
            System.out.println(quantidade + " passageiros desembarcaram");
        }
        else{
            System.out.println("Quantidade de passageiros a desembarcar é maior que o total.");
        }
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Numero de vagoes: " + numeroVagoes);
    }
}

//iniciando MAIN
public class ATVHeranca1 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Transporte transporte = null;
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Ônibus");
            System.out.println("2. Cadastrar Metrô");
            System.out.println("3. Iniciar Viagem");
            System.out.println("4. Exibir Dados do Transporte");
            System.out.println("5. Encerrar Viagem");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite a linha do ônibus: ");
                    String linhaOnibus = scanner.nextLine();
                    System.out.print("Digite o nome do motorista: ");
                    String motoristaOnibus = scanner.nextLine();
                    System.out.print("Digite a quantidade de passageiros: ");
                    int quantidadeOnibus = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Digite o tipo de ônibus (ex: articulado, micro-ônibus): ");
                    String tipoOnibus = scanner.nextLine();
                    transporte = new Onibus(linhaOnibus, motoristaOnibus, quantidadeOnibus, tipoOnibus);
                    System.out.println("Ônibus cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite a linha do metrô: ");
                    String linhaMetro = scanner.nextLine();
                    System.out.print("Digite o nome do motorista: ");
                    String motoristaMetro = scanner.nextLine();
                    System.out.print("Digite a quantidade de passageiros: ");
                    int quantidadeMetro = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o número de vagões: ");
                    int numeroVagoes = scanner.nextInt();
                    transporte = new Metro(linhaMetro, motoristaMetro, quantidadeMetro, numeroVagoes);
                    System.out.println("Metrô cadastrado com sucesso!");
                    break;

                case 3:
                    if (transporte != null) {
                        transporte.iniciarViagem();
                    } else {
                        System.out.println("Nenhum transporte cadastrado.");
                    }
                    break;

                case 4:
                    if (transporte != null) {
                        transporte.exibirDados();
                    } else {
                        System.out.println("Nenhum transporte cadastrado.");
                    }
                    break;

                case 5:
                    if (transporte != null) {
                        transporte.encerrarViagem();
                    } else {
                        System.out.println("Nenhum transporte cadastrado.");
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);

        scanner.close();
    }
}