package capitulo3;

import javax.swing.JOptionPane;

public class quest3 {
	
	public static void main(String args[]){
		String  login , senha, valor = "java8";
		
		for(int cont = 2; cont >= 0; cont --){
			login = getString("Forneça um login:");
			senha = getString("Forneça a senha:");
			
			if((valor.equals(login))&&(valor.equals(senha))){
				JOptionPane.showMessageDialog(null,"login e senha aceitos!");
				break;
			}
			else
				if(cont >0)
				JOptionPane.showMessageDialog(null,"Falha, verifique login e senha!\nVocê tem mais "+cont+" tentativa(s)!");
				
	
		}
		
	}
	
	private static String getString(String msg){
		
		return JOptionPane.showInputDialog(msg);
	}

}
