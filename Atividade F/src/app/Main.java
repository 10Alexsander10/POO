package app;
import domain.*;

/* 4 questao - Após imprimir o saldo (getSaldo()) de cada uma das contas, o que acontece?
*   Cada conta(c,cc and cp) retorna seu valor atualizado apos passar pelo metodo atualiza,
*   que alem de Conta fora sobrescrito em ContaCorrente e ContaPoupanca, mudando assim
*   a forma de cada um trabalhar  com um objeto conta independentemente.
*/
public class Main {

    public static void main(String[] args){
        /* "não importa como nos referimos a um objeto, o método que será invocado é sempre o mesmo!"
           como ContaCorrente() and ContaPoupanca() são objetos Conta, não havera nenhum erro
           em instanciar como um objeto Conta devido ao polimorfimos vamos estar referenciando o objeto correto.
        */
        Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);

        //c.atualiza(0.01);
        //cc.atualiza(0.01);
        //cp.atualiza(0.01);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);

        System.out.println("Saldo Total: " + adc.getSaldoTotal());
        System.out.println("#######Saldos######\n");
        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

    }

}
