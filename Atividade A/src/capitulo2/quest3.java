package capitulo2;
import javax.swing.JOptionPane;
public class quest3 {
	
	public static void main(String args[]){
		double val_venal,val_trans,percent;
		
		val_trans = getDouble("Digite o valor da transação: ");
		val_venal = getDouble("Digite o valor venal: ");
		percent = getDouble("Digite o percentual de imposto: ");
		
		if(val_trans > val_venal){
			JOptionPane.showMessageDialog(null,"Imposto a ser pago = " + (val_trans * percent)/100);
		}
		else
			JOptionPane.showMessageDialog(null,"Imposto a ser pago = " + (val_venal * percent)/100);
		
		
		
	}
	private static double getDouble(String msg){
		
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}

}
