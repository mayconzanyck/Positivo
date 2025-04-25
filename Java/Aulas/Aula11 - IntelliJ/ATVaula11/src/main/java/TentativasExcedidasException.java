public class TentativasExcedidasException extends Exception {

    public TentativasExcedidasException(){
        super("Numero maximo de tentativas excedido.");
    }
}
