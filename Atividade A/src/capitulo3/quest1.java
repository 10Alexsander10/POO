package capitulo3;
import javax.swing.JOptionPane;;
public class quest1 {
	
	public static void main(String args []){
		String produto;
		double valor;
		
		produto = String.valueOf(JOptionPane.showInputDialog(null,"Digite o nome do produto" ));
		valor = Double.valueOf(JOptionPane.showInputDialog(null,"Digite o valor do produto" ));
		
		double porcent;
		if(valor <= 0){
			showM("Valor Invalido");
			return;
		}
		else if(valor >= 50 && valor < 200)
			porcent = 0.05;
		else if(valor >= 200 && valor < 500)
			porcent = 0.06;
		else if(valor >= 500 && valor < 100)
			porcent = 0.07;
		else
			porcent = 0.08;
		
		showM("Nome do Produto: " + produto + "\nValor Original do produto: R$" + valor +"\nValor do produto com desconto: R$" + (valor - (valor * porcent)));
		
	}
	
	private static void showM(String msg){
		
		JOptionPane.showMessageDialog(null,msg);
	}

}
