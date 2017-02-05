package domain;

public class ContaPoupanca extends Conta {

    public void atualiza(double taxa) {
        super.deposita(super.getSaldo() * taxa * 3);
    }
}
