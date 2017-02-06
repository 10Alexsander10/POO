package domain;

import domain.Conta;

public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta c) {
        // aqui você imprime o saldo anterior.
        System.out.println("Saldo Anterior: "+c.getSaldo());
        // atualiza a conta
        c.atualiza(selic);
        // imprime o saldo final
        System.out.println("Saldo Atualizado: "+c.getSaldo());
        //somar o saldo final ao atributo saldoTotal
        saldoTotal += c.getSaldo();
    }

    public double getSaldoTotal(){
        return this.saldoTotal;
    }
}

