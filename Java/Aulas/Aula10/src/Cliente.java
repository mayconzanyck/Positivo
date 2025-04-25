/*
--------------------
Classe: Cliente.java
--------------------
*/


public class Cliente implements Autenticavel{

    //Atributo privado para armazenar o nome do Cliente
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    //Metodo obrigatorio de interface
    @Override
    public void autenticar(String usuario, String senha){
        
        if(usuario.equals("cliente") && senha.equals("123")){
            System.out.println("Cliente " + nome + " autenticado com sucesso.");
        }
        else{
            System.out.println("Falha na autenticação do cliente");
        }
    }
    
}
