package collections;

// COLEÇÕES : O que sao coleções?
// coleções sao estruturas que armazenam grupos de objetos - como listas,conjuntos,mapas
// filas ,etc.
// o java oferece o FrameWork de coleçoes( java.util), que traz varias interfaces e classes
// prontas para:
// - Armazenar dados de forma flexivel
// - percorrer os dados;
// - ordenar , buscar , adicionar e remover elementos com facilidade.

// PRINCIPAIS TIPOS DE COLEÇÔES
// LIST - Arraylist , LinkedList - Lista ordenada ( Aceita elementos repetidos)
// SEt  - HashSet , TreeSet      - Conjunto (Nao Aceita elementos repetidos)
// Map  - HashMap , TreeMap      - Pares chaves-valor ( ex: CPF -> None

import java.util.ArrayList;
import java.util.List;

public class ExemploLista {

    public static void main(String[] agrs){

        //Criação de uma lista
        List<String> nomes = new ArrayList<>();

        //Adicionando elementos a lista
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");

        //Acessando elementos pelo indice
        System.out.println("Primeiro nome: " + nomes.get(1));

        //Percorrendo a lista
        System.out.println("Todos os nomes: ");
        for(String nome : nomes){
            System.out.println(nome);
        }

        //Verificando o tamanho da lista
        System.out.println("Tamanho da lista: " + nomes.size());

        //Removendo um elemento da lista
        nomes.remove("Ana");
        System.out.println("Nomes após remoção: ");
        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}