import java.util.ArrayList;
import java.util.Scanner;

//Classe base Veiculo
abstract class Veiculo {

    protected int id;
    protected String marca;
    protected int ano;

    //Construtor
    public Veiculo(int id, String marca, int ano){
        this.id = id;
        this.marca = marca;
        this.ano = ano;
    }

    public abstract void exibirDados();
}

//Subclasse Onibus
class Onibus extends Veiculo{

    private int capacidadePassageiros;
    private String tipo;

    //Construtor
    public Onibus(int id, String marca, int ano, int capacidadePassageiros, String tipo){

        super(id, marca, ano);

        this.capacidadePassageiros = capacidadePassageiros;
        this.tipo = tipo;
    }

    public void abrirPortas(){
        System.out.println("Portas do onibus abertas!");
    }

    public void fecharPortas(){
        System.out.println("Portas do onibus fechadas!");
    }

    @Override
    public void exibirDados(){
        System.out.println("Onibus");
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Capacidade: " + capacidadePassageiros);
        System.out.println("Tipo: " + tipo);
    }
}

//Subclasse Metro
class Metro extends Veiculo{

    private int numeroVagoes;
    private boolean temArCondicionado;

    //Construtor
    public Metro(int id, String marca, int ano, int numeroVagoes, boolean temArCondicionado){

        super(id, marca, ano);

        this.numeroVagoes = numeroVagoes;
        this.temArCondicionado = temArCondicionado;
    }

    public void embarcarPassageiros(int quantidade){
        System.out.println(quantidade + " passageiros embarcados.");
    }

    public void desembarcarPassageiros(int quantidade){
        System.out.println(quantidade + " passageiros desembarcados.");
    }

    @Override
    public void exibirDados(){
        System.out.println("Metro");
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Numero de Vagoes: " + numeroVagoes);
        System.out.println("Ar Condicionado: " + (temArCondicionado ? "Sim" : "Não"));
    }
}

//Classe Garagem
class Garagem{

    //Lista que guarda veiculo
    private ArrayList<Veiculo> listaDeVeiculos = new ArrayList<Veiculo>();

    public void adicionarVeiculo(Veiculo veiculo){
        listaDeVeiculos.add(veiculo);
    }

    public void listarTodos(){
        for(Veiculo veiculo : listaDeVeiculos){

            veiculo.exibirDados();
            System.out.println();
        }
    }

    public void listarPorTipo(){
        for(Veiculo veiculo : listaDeVeiculos){

            if(veiculo instanceof Onibus){
                System.out.println("Veiculo do tipo Onibus: ");
            } else if(veiculo instanceof Metro){
                System.out.println("Veiculo do tipo Metro: ");
            }
            veiculo.exibirDados();
            System.out.println();
        }
    }

    public void contarVeiculos(){
        int quantidadeOnibus = 0;
        int quantidadeMetro = 0;

        for(Veiculo veiculo : listaDeVeiculos){

            if(veiculo instanceof Onibus){
                quantidadeOnibus++;
            } else if(veiculo instanceof Metro){
                quantidadeMetro++;
            }
        }

        System.out.println("Total de Onibus: " + quantidadeOnibus);
        System.out.println("Total de Metros: " + quantidadeMetro);
    }

    public ArrayList<Veiculo> getListaDeVeiculos(){
        return listaDeVeiculos;
    }
}

//Classe Principal
public class Atv02 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Garagem garagem = new Garagem(); //Criar a garagem
        int opcao = -1;

        //Menu vai aparecer enqunto nao for escolhio "0"
        while (opcao != 0) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Cadastrar onibus");
            System.out.println("2. Cadastrar metro");
            System.out.println("3. Listar todos os veiculos");
            System.out.println("4. Listar veiculos por tipo");
            System.out.println("5. Executar ação especifica");
            System.out.println("6. Mostrar quantidade de veiculos por tipo");
            System.out.println("0. Sair");
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            //Opções
            if (opcao == 1) {
  
                System.out.println("Cadastro de Onibus:");
                System.out.print("ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Marca: ");
                String marca = scanner.nextLine();
                System.out.print("Ano: ");
                int ano = scanner.nextInt();
                System.out.print("Capacidade de passageiros: ");
                int capacidade = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Tipo (normal, articulado): ");
                String tipo = scanner.nextLine();

                Onibus onibus = new Onibus(id, marca, ano, capacidade, tipo);
                garagem.adicionarVeiculo(onibus);

            } else if (opcao == 2) {
                System.out.println("Cadastro de Metro:");
                System.out.print("ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Marca: ");
                String marca = scanner.nextLine();
                System.out.print("Ano: ");
                int ano = scanner.nextInt();
                System.out.print("Numero de vagoes: ");
                int vagoes = scanner.nextInt();
                System.out.print("Tem ar condicionado? (true/false): ");
                boolean ar = scanner.nextBoolean();

                Metro metro = new Metro(id, marca, ano, vagoes, ar);
                garagem.adicionarVeiculo(metro);

            } else if (opcao == 3) {
                System.out.println("Lista de todos os veiculos:");
                garagem.listarTodos();

            } else if (opcao == 4) {
                System.out.println("Lista por tipo de veiculo:");
                garagem.listarPorTipo();

            } else if (opcao == 5) {
                System.out.print("Digite o ID do veiculo: ");
                int idBusca = scanner.nextInt();

                for (Veiculo veiculo : garagem.getListaDeVeiculos()) {
                    if (veiculo.id == idBusca) {
                        if (veiculo instanceof Onibus) {
                            Onibus onibus = (Onibus) veiculo;
                            onibus.abrirPortas();
                            onibus.fecharPortas();

                        } else if (veiculo instanceof Metro) {
                            Metro metro = (Metro) veiculo;
                            System.out.print("Quantidade de passageiros embarcando: ");
                            int qtdEmbarque = scanner.nextInt();
                            metro.embarcarPassageiros(qtdEmbarque);

                            System.out.print("Quantidade de passageiros desembarcando: ");
                            int qtdDesembarque = scanner.nextInt();
                            metro.desembarcarPassageiros(qtdDesembarque);
                        }
                        break;
                    }
                }

            } else if (opcao == 6) {
                garagem.contarVeiculos();

            } else if (opcao == 0) {
                System.out.println("Programa encerrado.");

            } else {
                System.out.println("Opção invalida.");
            }
        }

        scanner.close();
    }
}