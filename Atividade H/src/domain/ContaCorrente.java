package domain;

public class ContaCorrente extends Conta{

    public void atualiza(double taxa) {
        try {
			super.deposita(super.getSaldo() * taxa * 2);
		} catch (ValorInvalidoException e) {
			e.printStackTrace();
		}
    }

    public void deposita(double valor) {

        this.saldo += valor - 0.10;
    }

}
