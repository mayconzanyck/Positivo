import java.util.Scanner;
import java.io.*; //io = input output

public class ProgramaPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();

        Pessoa pessoa = new Pessoa(nome, idade);

        //Serialiazação (salvar objeto em arquivo)
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pessoa.dat"))) {
            oos.writeObject(pessoa);
            System.out.println("Objeto pessoa salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o objeto: " + e.getMessage());
        }

        //Desserialização (ler o objeto do arquivo)
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pessoa.dat"))) {
            Pessoa pessoaLida = (Pessoa) ois.readObject(); //le o objeto e faz cast
            System.out.println("\nObjeto lido do arquivo: ");
            pessoaLida.exibirDados(); //exibe os dados
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao ler o objeto: " + e.getMessage());
        }
        scanner.close();
    }
}