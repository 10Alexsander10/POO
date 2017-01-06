package capitulo5;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class quest5 {
	
	public static void main(String[] args){
		
		int op;
		String[] parking = new String[10];
		Arrays.fill(parking, "vazio" );
		String lista = "";
		
		while(true){
			
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - Entrada \n2 - Saída \n3 - Listar situação atual \n4 - Encerrar"));
			
			switch(op){
			
			case 1:
				int vaga = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da vaga[0-9]:"));
				if(parking[vaga].equals("vazio"))
					parking[vaga] = JOptionPane.showInputDialog("Digite o numero da placa:");
				else
					JOptionPane.showMessageDialog(null,"Vaga Indisponivel");
				break;
			case 2:
				vaga = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da vaga a desocupar:"));
				if((parking[vaga].equals("vazio"))!= true)
					parking[vaga] = "vazio";
				else
					JOptionPane.showMessageDialog(null,"Vaga já vazia");
				break;
			case 3:
				for(int i = 0; i < parking.length ; i++)
					lista += ( i + "ª vaga: " + parking[i] + "\n" );
				JOptionPane.showMessageDialog(null,"-------Estacionamento-------\n" + lista);
				break;
			case 4:
				return;
			default:
				JOptionPane.showMessageDialog(null, "OPCAO INVALIDA");;
				break;
			}
		}
	}
}

		
		
		
