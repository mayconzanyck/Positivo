// oq e classe ?
// Uma classe é um modelo(molde) que define atributos (características)
// e método (ações) de um objeto.
// Imagine que uma classe seja um "molde de bolo".
// Com esse molde, podemos fazer varios boolos (objetos)iguals,
// mas com recheios diferentes.

class Carro {
    String modelo;
    int ano;

    void buzinar(){
        System.out.println("Bii Bii!!!!!!!!!!!!");
    }
}
// a classe  Carro define o que um carro deve ter (modelo e ano)
// e o que ele pode fazer (buzinar());

//o que  é um objet0?
// um objeto é uma instancia de uma classe.
// Ele representa um exemplo real do que foi definido no molde
//se a classe Carro é um molde de bolo, o objeto meuCarro é um bolo feito com 
//esse molde.
public class ExemploPOO1 {

    public static void main(String[] args){
        //criando um objeto da Classe Carro
        Carro meuCarro = new Carro();

        //Definindo valores para o atributo
        meuCarro.modelo = "Civic";
        meuCarro.ano = 2022;

        //Chamando um metodo do objeto
        meuCarro.buzinar();

        //Exibindo os valores do objeto
        System.out.println("Meu carro é um " + meuCarro.modelo + " " + meuCarro.ano);
    }
}
