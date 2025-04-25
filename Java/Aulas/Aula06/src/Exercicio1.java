/*
Criar um classe livro com os atributos:
titulo, paginas, disponibilidade.

Os atributos devem ser privados e voces deveram criar os metodos get para acessar os valores
Incializar os valores no main() usando o construtor
Exibir as informações do livro usando apenas os metodos get

Saida esperada:
Titulo: O Senhor dos Aneis
Paginas: 1200
Status: Disponivel para empresimo
*/

class Livro{

    private String titulo;
    private int paginas;
    private Boolean disponibilidade;

    //CONSTRUTOR
    public Livro(String titulo, int paginas, Boolean novaDisponibilidade){
        this.titulo = titulo;
        this.paginas = paginas;
        this.disponibilidade = novaDisponibilidade;
    }

    //GETTER
    public String getTitulo(){
        return titulo;
    }

    public int getPaginas(){
        return paginas;
    }

    public Boolean isDisponibilidade(){
        return disponibilidade;
    }
}

public class Exercicio1 {
    
    public static void main(String[] args) {
    
    Livro l = new Livro("O Senhor dos Aneis", 1200, true);

    System.out.println("Titulo: " + l.getTitulo());
    System.out.println("Paginas: " + l.getPaginas());
    System.out.println("Disponibilidade: " + (l.isDisponibilidade()? "Disponivel para emprestimo":"Nao disponivel para emprestimo"));
    }
}
