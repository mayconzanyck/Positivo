package ex2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
    public static void main(String[] args){
        String nomeArquivo = "saida.txt";

        try (BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo))){
            String linha;
            while ((linha = leitor.readLine()) != null){
                System.out.println("Linha lida: " + linha);
            }
        } catch (IOException e){
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}