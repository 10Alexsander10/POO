package app;

import domain.*;

public class TestaGerenciadordeImpostodeRenda {
	public static void main(String[] args){
		  
	    GerenciadorDeImpostodeRenda gerenciador = new GerenciadorDeImpostodeRenda();
	    
	    SegurodeVida sv = new SegurodeVida();
	    gerenciador.adiciona(sv);
	  
	    ContaCorrente cc = new ContaCorrente();
	    try {
			cc.deposita(1000);
		} catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    gerenciador.adiciona(cc);

	    System.out.println(gerenciador.getTotal());
	    System.out.printf("O saldo é: %.2f", cc.getSaldo());
	}
}


