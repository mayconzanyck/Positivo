package view;

import model.Pessoa;
import controller.PessoaController;

public class Main {

    public static void main(String[] args) {

        Pessoa p = new Pessoa("Ana", 18);
        PessoaController controller = new PessoaController();
        controller.mostrarPessoa(p);
    }
}
