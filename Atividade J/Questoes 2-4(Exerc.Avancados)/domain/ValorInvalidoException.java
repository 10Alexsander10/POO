package domain;

public class ValorInvalidoException extends Exception/*RuntimeException*/{

	ValorInvalidoException(String mensagem){
		super(mensagem);
	}
	
	ValorInvalidoException(double valor){
		super("Valor Invalido: " + valor);
	}
	
}
