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
		
		/*Quest�o 2 - Tente chamar o m�todo getSaldo atrav�s da refer�ncia t, o que ocorre? Por qu�?
		 *Apresenta erro. Pois tributavel tem apenas o metodo calculaTributos no qual ContaCorrente assinou
		 *contrato para implementa��o, sendo assim nenhum outro metodo do escopo da Classe � acessado.
		 */
	}

}
