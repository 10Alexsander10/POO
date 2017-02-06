package app;

import domain.*;

public class MainBanco {
    public static void main(String[] args) {
        Banco bc = Banco.getInstance();

        ContaCorrente c = new ContaCorrente();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        
        try {
        	c.deposita(1000);
            cc.deposita(1000);
            cp.deposita(1000);
            cp.deposita(100);
          }catch (ValorInvalidoException e){
        	 System.out.println(e.getMessage());
          }
        bc.adiciona((Conta) c);
        bc.adiciona((Conta) cc);
        bc.adiciona(cp);

        //c.atualiza(0.01);
        //cc.atualiza(0.01);
        //cp.atualiza(0.01);

        AtualizadorDeContas atl = new AtualizadorDeContas(0.01);

        for(int i = 0; i <= bc.pegaTotalDeContas();i++)
            atl.roda(bc.pegaConta(i));

        System.out.println("Saldo Total: " + atl.getSaldoTotal());
        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

    }
}
