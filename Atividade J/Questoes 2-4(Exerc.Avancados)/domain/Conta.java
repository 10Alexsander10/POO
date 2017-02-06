package domain;

public interface Conta {
	public double getSaldo();
	public void deposita(double valor) throws ValorInvalidoException;
	public void saca(double valor);
	public void atualiza(double taxaSelic);
		
}
