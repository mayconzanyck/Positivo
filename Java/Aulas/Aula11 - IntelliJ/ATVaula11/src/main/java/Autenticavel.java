public interface Autenticavel {

    public void autenticar(String usuario, String senha) throws TentativasExcedidasException;
}
