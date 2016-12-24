package capitulo2;

import javax.swing.JOptionPane;

public class quest4 {
	
	public static void main(String args[]){
		double nota1,nota2,trab,media;
		
		nota1 = getDouble("Digite a nota da primeira prova: ");
		nota2 = getDouble("Digite a nota da segunda prova: ");
		trab = getDouble("Digite a nota do trabalho: ");
		media = (nota1 + nota2 + trab)/3;
		if(media < 6)
			JOptionPane.showMessageDialog(null, media + "\nReprovado");
			
		else
			JOptionPane.showMessageDialog(null, media + "\nAprovado");
		
	}
	
private static double getDouble(String msg){
		
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}

}
