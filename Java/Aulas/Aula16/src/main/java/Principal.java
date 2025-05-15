import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class Principal{
    public static void main(String args[]){
        Pessoa pessoa = new Pessoa("João", 25);

        // Criando o objeto Gson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Serialização salvando o objeto em um arquivo Json
        try(FileWriter writer = new FileWriter("pessoa.json")){
            gson.toJson(pessoa, writer);
            System.out.println("Objeto salvo em pessoa.json");
        } catch(IOException e){
            e.printStackTrace();
        }

        // Desserialização: lendo o objeto de um arquivo JSON
        try(FileReader reader = new FileReader("pessoa.json")){
            Pessoa pessoaLida = gson.fromJson(reader, Pessoa.class);
            System.out.println("Objeto lido do Json: ");
            System.out.println("Nome: " + pessoaLida.getNome());
            System.out.println("Idade: " + pessoaLida.getIdade());
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}