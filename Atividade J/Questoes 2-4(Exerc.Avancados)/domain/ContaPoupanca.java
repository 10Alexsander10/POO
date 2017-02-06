package domain;

import domain.Conta;
import domain.ValorInvalidoException;

public class ContaPoupanca implements Conta {
	
	protected double saldo;
	
    public void atualiza(double taxa) {
        try {
			deposita(this.saldo * taxa * 3);
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
    		this.saldo += valor;
    }
    
    public double getSaldo() {

        return this.saldo;
    }

    public void saca(double valor) {

    	this.saldo -= valor;
    }
    
}

