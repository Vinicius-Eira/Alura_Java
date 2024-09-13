package Try_Catch_exercicio2;

public class SenhaInvalidaException extends RuntimeException{


    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
