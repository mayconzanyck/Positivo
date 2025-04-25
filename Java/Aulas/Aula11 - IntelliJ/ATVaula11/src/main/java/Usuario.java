public class Usuario implements Autenticavel{

    private String nome;
    private int tentativas;

    public Usuario(String nome){
        this.nome = nome;
        this.tentativas = 0;
    }

    @Override
    public void autenticar(String usuario, String senha) throws TentativasExcedidasException{

        if(tentativas >= 3){
            throw new TentativasExcedidasException();
        }
        if(usuario.equals("admin") && senha.equals("123")) {
            System.out.println("Admin " + nome + " autenticado com sucesso");
            tentativas = 0;
        }
        else{
            tentativas++;
            System.out.println("Usuario ou senha incorretos. Tentativas restantes: " + tentativas + ".");

            if(tentativas >= 3){
                throw new TentativasExcedidasException();
            }
        }
    }
}
