/*
--------------------------
Classe: Administrador.java
--------------------------
*/

public class Administrador implements Autenticavel{
    
    //Atributo privado para armazenar o nome do Administrador
    private String nome;

    public Administrador(String nome){
        this.nome = nome;
    }

    //Metodo obrigatorio da interface
    @Override
    public void autenticar(String usuario, String senha){

        //Simulaçao de login fixo
        //Equals() e um metodo usado para comparar o conteudo de dois objetos
        if(usuario.equals("admin") && senha.equals("123")){
            System.out.println("Administrador " + nome + " autenticado com sucesso.");
        }
        else{
            System.out.println("Falha na autenticação do administrador");
        }
    }
}
//A classe usa implements para indicar que ela esta se comprometendo a seguir o contrato da interface
//O metodo autenticar tem uma simulaçao de verificaçao de login com valores fixos
//O uso de @Override indica que estamos implementando um metodo de interface