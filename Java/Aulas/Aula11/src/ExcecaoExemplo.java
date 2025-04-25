import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecaoExemplo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Digite um numero inteiro: ");
            int numero = scanner.nextInt();
            int resultado = 100 / numero;
            System.out.println("100 dividido por " + numero + "=" + resultado);
        } catch(InputMismatchException e){
            System.out.println("Erro: Voce deve digitar um numero inteiro.");
        } catch(ArithmeticException e){
            System.out.println("Erro: Divisão por zero não é permitido.");
        } catch(NumberFormatException e){
            System.out.println("Erro: Valor digitado não pode ser convertido para numero.");
        } catch(Exception e){
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally{
            System.out.println("Execução finalizada.");
            scanner.close();
        } //Se der algum erro, capture esse erro e me de acesso a ele atraves da variavel e.
    }   //O catch mais especifico vem antes do Exception(que é mais generico).
}     //Se colocar catch (Exception e) primeiro, os outros nunca serão alcançados.
