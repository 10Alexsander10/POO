package domain;


public abstract class Conta {
    protected double saldo;

    public abstract void atualiza(double taxa);


    public void deposita(double valor) throws ValorInvalidoException {
    	if(valor < 0){
    		//throw new ValorInvalidoException("Voc� tentou depositar um valor negativo");
    		throw new ValorInvalidoException(valor);
    	}
    	else
    		this.saldo += valor;
    }

    public void saca(double valor) {

        this.saldo -= valor;
    }

    public double getSaldo() {

        return this.saldo;
    }
}
