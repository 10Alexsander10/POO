package app;

import domain.*;

public class TestaTributavel {
	
	public static void main(String args[]){
		
		ContaCorrente cc = new ContaCorrente();
		try {
			cc.deposita(100);
		} catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cc.calculaTributos());
		
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		
		/*Questão 2 - Tente chamar o método getSaldo através da referência t, o que ocorre? Por quê?
		 *Apresenta erro. Pois tributavel tem apenas o metodo calculaTributos no qual ContaCorrente assinou
		 *contrato para implementação, sendo assim nenhum outro metodo do escopo da Classe é acessado.
		 */
	}

}
