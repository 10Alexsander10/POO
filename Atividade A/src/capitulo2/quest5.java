package capitulo2;

import javax.swing.JOptionPane;

public class quest5 {
	
	public static void main(String args[]){
		int idade, anos_cont;
		String sexo;
		
		idade = getInt("Idade: ");
		sexo = String.valueOf(JOptionPane.showInputDialog("Digite o sexo 'M'  ou 'F' :"));
		anos_cont = getInt("Anos de Contribuição: ");
		char sexo1 = sexo.charAt(0);

		
		if(sexo1 == 'M' || sexo1 =='m')
			if(anos_cont >=35 ||idade >= 65)
				JOptionPane.showMessageDialog(null,"você já tem o direito a aposentadoria");
			else
				JOptionPane.showMessageDialog(null,"Ainda falta " + (35 - anos_cont) + " anos para aposentadoria");
			
		else
			if(anos_cont >=30 ||idade >= 60)
				JOptionPane.showMessageDialog(null,"você já tem o direito a aposentadoria");
	
			else
				JOptionPane.showMessageDialog(null,"Ainda falta " + (30 - anos_cont) + " anos para aposentadoria");
				
			
		}
		
	private static int getInt(String msg){
		
		return Integer.valueOf(JOptionPane.showInputDialog(msg));
	}
}


