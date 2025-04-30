package collections;


//Um Map é uma estrutura que armazena pares chaves e valor
//Cada chave e unica (nao pode se repetir)
//Pode ser pensado como um dicionario

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

    public static void main(String[] args) {

        //Criando um Map onde a chave é String(nome) e o valor é Integer(idade)
        Map<String, Integer> pessoas = new HashMap<>();

        //Adicionando elementos
        pessoas.put("Ana", 25);
        pessoas.put("Bruno", 30);
        pessoas.put("Carlos", 20);

        //Posso atualizar a idade da ana
        pessoas.put("Ana", 28);

        //Imprimindo o Map
        System.out.println("Lista de Pessoas: ");
        for(String nome : pessoas.keySet()){
            Integer idade = pessoas.get(nome);
            System.out.println(nome + " - " + idade + " anos.");
        }

        //Verificando se uma pessoa esta no Map
        if(pessoas.containsKey("Julia")){
            System.out.println("Julia esta cadastrada.");
        }
        else{
            System.out.println("Julia não esta cadastrada.");
        }

        //Removendo uma pessoa
        pessoas.remove("Ana");

        //Mostrando o tamanho do Map
        System.out.println("Quantidade de pessoas cadastradas: " + pessoas.size());
    }
}
