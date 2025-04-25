import java.util.Scanner;

/*
-----------------------------------
Classe principal: SistemaLogin.java
-----------------------------------
*/

public class SistemaLogin {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Criando os objetos com o tipo da interface (polimorfismo)

        Autenticavel adm = new Administrador("Fernanda");
        Autenticavel cli = new Cliente("João");

        //Entrada de dados para o Administrador
        System.out.println("=== LOGIN ADIMINISTRADOR ===");
        System.out.println("Usuario: ");
        String usuarioAdm = scanner.nextLine();
        System.out.println("Senha: ");
        String senhaAdm = scanner.nextLine();

        //Chama o metodo de autenticaçao - comportamento especifico de adiministrador
        adm.autenticar(usuarioAdm, senhaAdm);

        //Entrada de dados para Cliente
        System.out.println("=== LOGIN CLIENTE ===");
        System.out.println("Usuario: ");
        String usuarioCli = scanner.nextLine();
        System.out.println("Senha: ");
        String senhaCli = scanner.nextLine();

        //Chama o metodo de autenticaçao - comportamento especifico de cliente

        cli.autenticar(usuarioCli, senhaCli);

        scanner.close();

    }
}
