// oque é encapsulamento??
// É o conceito de esconder os detalhes internos de uma classe e
// permitie o acesso a eles somente por meio de metodos controlados

// Fazendo uma analogia : Imagine uma caixa com tampa ( a classe)
// dentro dela estao os atributos protegidos ( variaveis privadas),
// e voce só pode interagir com eles por meio de botões na tampa
// (métodos publicos de get e set).

class Pessoa {
    String nome;
    int idade;

}

public class Encapsulamento { // exemplo sem encapsulamento

    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();
        p.nome ="João";
        p.idade = 10 ;
        if (p.idade >= 0){
            System.out.println(p.nome + " tem "+ p.idade + "anos ");

        } else {
                System.out.println( "idade invalida");      
            }
        p.idade =-5;

        System.out.println(p.nome + " tem "+ p.idade + " anos");
}
}
