
import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario("João");

        while (true) {
            try{
            System.out.print("Digite o usuário: ");
            String login = scanner.nextLine();

            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            usuario.autenticar(login, senha);
            break; // Sai do loop se autenticar com sucesso

            } catch (TentativasExcedidasException e) {
                System.out.println(e.getMessage());
                break; // Interrompe a execução
            }
        }

        scanner.close();
    }
}