package domain;

public class ContaPoupanca extends Conta {

    public void atualiza(double taxa) {
        try {
			super.deposita(super.getSaldo() * taxa * 3);
		} catch (ValorInvalidoException e) {
			e.printStackTrace();
		}
    }
}
