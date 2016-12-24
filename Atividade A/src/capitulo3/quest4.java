package capitulo3;
import javax.swing.JOptionPane;

public class quest4 {
	
	public static void main(String[] args){
		
		int  numero;
		String  tabuada = "";
		
		numero = Integer.valueOf(JOptionPane.showInputDialog("Digite um número:"));
		
		for(int i = 1 ; i <= 10 ; i++)
			tabuada += (numero + " x " + i + " = " + (numero* i) + "\n" ); 
		
		JOptionPane.showMessageDialog(null,tabuada);
		
	}

}
