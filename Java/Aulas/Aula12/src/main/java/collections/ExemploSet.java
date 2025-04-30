package collections;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

    public static void main(String[] args){

        //Criando um conjunto
        Set<String> cores = new HashSet<>();

        //Adicionando elementos
        cores.add("Vermelho");
        cores.add("Roxo");
        cores.add("Preto");
        cores.add("Verde");

        //Testando adicionar uma cor ja existente
        cores.add("Preto"); //Nao sera modificado

        //Imprimindo o conjunto
        System.out.println("Cores: ");
        for(String cor : cores){
            System.out.println(cor);
        }

        //Verificando se contem uma cor
        if(cores.contains("Azul")){
            System.out.println("Contem a cor Azul");
        }
        else{
            System.out.println("Não contem a cor Azul");
        }

        //Removendo uma cor
        cores.remove("Vermelho");

        //Tamanho do conjunto
        System.out.println("Tamanho do conjunto: " + cores.size());
    }
}