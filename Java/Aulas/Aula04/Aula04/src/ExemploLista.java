import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    
    public static void main(String[] args){

        //Criando uma lista de nomes
        List<String> nomes = new ArrayList<>();

        //List<String> -> Interface que define uma lista de Strings 
        //nomes -> Nome da variavel que armazenará a lista
        //new ArrayList<>() -> Criação de uma nova lista dinamica
            //que pode crescer  ou diminuir de tamanho

        //Adicionando elementos na lista
        nomes.add("Ana");
        nomes.add("Nicole");
        nomes.add("Carlos");
        nomes.add("Bruno");

        //Exibindo os elementos da lista
        System.out.println("Lista de nomes: ");
        for(String nome : nomes){

            System.out.println(nome);
        }

        //Removendo um elemento
        nomes.remove("Bruno");

        //Exibindo a lista após remoção
        System.out.println("\nLista após remoção: ");
        for(String nome : nomes){

            System.out.println(nome);
        }

        //Verificando se um nome esta na lista
        if(nomes.contains("Nicole")){

            System.out.println("\nNicole está na lista!");
        }

        //Obtendo o tamanho da lista
        System.out.println("\nTamanho da lista: " + nomes.size());

        //Imprimindo apenas o segundo nome da lista
        System.out.println("Segundo nome da lista: " + nomes.get(1));
    }
}
