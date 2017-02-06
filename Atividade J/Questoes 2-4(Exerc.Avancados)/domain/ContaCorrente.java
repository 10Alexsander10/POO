package domain;

import domain.ValorInvalidoException;

public class ContaCorrente implements Tributavel, Conta{
	
	protected double saldo;
	
    public void atualiza(double taxa) {
        try {
			deposita(this.saldo * taxa * 2);
		} catch (ValorInvalidoException e) {
			e.printStackTrace();
		}
    }
    
    
    public void deposita(double valor) throws ValorInvalidoException {
    	if(valor < 0){
    		//throw new ValorInvalidoException("Você tentou depositar um valor negativo");
    		throw new ValorInvalidoException(valor);
    	}
    	else
    		this.saldo += valor - 0.10;
    }

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
	
	
	public double getSaldo() {

	    return this.saldo;
	}

	public void saca(double valor) {

		this.saldo -= valor;
	}
}










