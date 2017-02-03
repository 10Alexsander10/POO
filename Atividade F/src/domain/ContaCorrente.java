package domain;

public class ContaCorrente extends Conta{

    public void atualiza(double taxa) {
        super.deposita(super.getSaldo() * taxa * 2);
    }

    public void deposita(double valor) {
        this.saldo += valor - 0.10;
    }

}
