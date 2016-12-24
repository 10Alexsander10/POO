package capitulo3;
import javax.swing.JOptionPane;;
public class quest2 {
	
	public static void main(String args []){
		double resist[] = {0,0,0,0};
		double RE;
		resist[0] = getDouble("Digite o valor da primeira resistencia:");
		resist[1]= getDouble("Digite o valor da segunda resistencia:");
		resist[2] = getDouble("Digite o valor da terceira resistencia:");
		resist[3] = getDouble("Digite o valor da quarta resistencia:");
		
		RE = resist[0] + resist[1] + resist[2] + resist[3];
		double aux;
		
		for(int x = 0 ; x < 4 ; x++)
			for(int y = 0; y < 3 ; y++){
				if(resist[y] > resist[y+1]){
					aux = resist[y];
					resist[y] = resist[y+1];
					resist[y+1] = aux;
				}
			}
		showM("Resistência equivalente: " + RE + "\n A maior Resistência é: " + resist[3] + "\nA menor Resistência é: " +  resist[0]);
		
	}
	
	private static double getDouble(String msg){
		
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}
	
	private static void showM(String msg){
		
		JOptionPane.showMessageDialog(null,msg);
	}

}
