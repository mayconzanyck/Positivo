
class Pessoa1{
    private String nome;
    private int idade ;

    // GETTERS  
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade ;
    }
    // SETTERS (para alterar)
    public void setNome(String novoNome){
        nome = novoNome;
    }
    public void setIdade (int novaIdade){
        if (novaIdade>= 0){
            idade = novaIdade;
        } else {
            System.out.println("idade invalida");
        }
    }
}

public class Encapsulamento1 {
    public static void main(String[] args) {

        Pessoa1 p = new Pessoa1();
        p.setNome("joao");
        p.setIdade(-5); // agr e verificado
        System.out.println(p.getNome()+ " tem " + p.getIdade() + " anos"); 
    }
}

/*
Oque é um metodo GET?
Um metodo GET ou GETTER é um metodo publico que serve para ler(ou acessar) o valor
de um atributo privado de uma classe.
Quando um atributo é private, ele nao pode ser acessado diretamente de fora da classe
o metodo GET e a forma controlada e segura de obter esse valor
o metodo SET ou SETTER, serve para alterar o valor de um atributo
*/