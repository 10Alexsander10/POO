package aplication;
import javax.swing.JOptionPane;

public class hello {
	
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome:");
		//System.out.println("Olá Java "+nome);
		JOptionPane.showMessageDialog(null,"Olá Java " + nome);
		
	}
}
