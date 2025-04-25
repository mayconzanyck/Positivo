//Um construtor é um metodo especial dentro de uma classe que é executado automaticamente quando o objeto e criado, o objetivo do construtor é inicializar os atributos do objeto
/*
Regras de um construtor em java:
Mesmo nome da classe;
Nao possui retorno(nem void);
Executado automaticamente ao criar um objeto(new); 
 */

class Carro1{
    String modelo;
    int ano;

    //Criando construtor da classe com parametros "()"
    public Carro1(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    void Imprimir(){
        System.out.println("Modelo: " + modelo + " Ano: " + ano);
    }
}

public class ExemploConstrutor {
    
    public static void main(String[] args) {
        
        //Criando um objeto com o construtor
        Carro1 carro = new Carro1("civic", 2022);
        carro.Imprimir();
    }
}
