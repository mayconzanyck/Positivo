/* 
1)Criar uma classe Produto que tenha nome, preço e quantidade. O programa deve permitir que o usuário cadastre um produto e exiba as informações na tela.

Exemplo de Entrada:

Digite o nome do produto: Teclado Mecânico

Digite o preço do produto: 299.99

Digite a quantidade em estoque: 10

--

Exemplo de Saída:

Produto: Teclado Mecânico

Preço: R$299.99

Quantidade: 10 unidades 
*/
import java.util.Scanner;

class Produto{
    
    String nome;
    double preco;
    int quantidade;

    public void cadastrarProduto(){

        System.out.println("\nINFORMAÇÃO PRODUTO");
        System.out.println("Tipo do produto: " + nome);
        System.out.println("Preço do produto: " + preco);
        System.out.println("Quantidade disponivel: " + quantidade);
    }
}

public class Exercicio1 {
    
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    Produto produto = new Produto();

    System.out.print("Produto desejado: ");
    produto.nome = scanner.nextLine();

    System.out.print("Preço: ");
    produto.preco = scanner.nextDouble();

    System.out.print("Quantidade: ");
    produto.quantidade = scanner.nextInt();

    produto.cadastrarProduto();

    scanner.close();
    }
}
