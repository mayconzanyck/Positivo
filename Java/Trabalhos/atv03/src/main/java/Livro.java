public class Livro implements Emprestavel {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true; //livro está disponível
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() throws Exception {
        if (!disponivel) {
            throw new Exception("Livro ja emprestado.");
        }
        disponivel = false;
    }

    public void devolver() {
        disponivel = true;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + " | Autor: " + autor + " | ISBN: " + isbn +
                " | Disponivel: " + (disponivel ? "Sim" : "Nao");
    }
}