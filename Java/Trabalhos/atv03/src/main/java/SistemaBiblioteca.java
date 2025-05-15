import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SistemaBiblioteca {
    private static Map<String, Livro> livros = new HashMap<>();
    private static Set<String> isbns = new HashSet<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n--- Sistema de Biblioteca ---");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Emprestar Livro");
            System.out.println("3. Devolver Livro");
            System.out.println("4. Listar Livros");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); //limpa o buffer

            switch (opcao) {
                case 1 -> cadastrarLivro();
                case 2 -> emprestarLivro();
                case 3 -> devolverLivro();
                case 4 -> listarLivros();
                case 5 -> System.out.println("Encerrando o programa..");
                default -> System.out.println("Opção invalida.");
            }

        } while (opcao != 5);
    }

    private static void cadastrarLivro() {
        try {
            System.out.print("Titulo: ");
            String titulo = scanner.nextLine();
            System.out.print("Autor: ");
            String autor = scanner.nextLine();
            System.out.print("ISBN: ");
            String isbn = scanner.nextLine();

            if (isbns.contains(isbn)) {
                throw new LivroDuplicadoException("Erro: ISBN ja cadastrado.");
            }

            Livro novoLivro = new Livro(titulo, autor, isbn);
            livros.put(isbn, novoLivro);
            isbns.add(isbn);
            System.out.println("Livro cadastrado com sucesso!");

        } catch (LivroDuplicadoException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void emprestarLivro() {
        System.out.print("Digite o ISBN do livro a ser emprestado: ");
        String isbn = scanner.nextLine();

        Livro livro = livros.get(isbn);
        if (livro != null) {
            try {
                livro.emprestar();
                System.out.println("Livro emprestado com sucesso.");
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } else {
            System.out.println("Livro nao encontrado.");
        }
    }

    private static void devolverLivro() {
        System.out.print("Digite o ISBN do livro a ser devolvido: ");
        String isbn = scanner.nextLine();

        Livro livro = livros.get(isbn);
        if (livro != null) {
            livro.devolver();
            System.out.println("Livro devolvido com sucesso.");
        } else {
            System.out.println("Livro nao encontrado.");
        }
    }

    private static void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.println("\n--- Lista de Livros ---");
            for (Livro livro : livros.values()) {
                System.out.println(livro);
            }
        }
    }
}
