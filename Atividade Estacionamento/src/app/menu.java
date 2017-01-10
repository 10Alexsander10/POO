package app;
import domain.*;
import javax.swing.JOptionPane;

public class menu {
	
	public static void main(String[] args){
		
		int op;
		estacionamento park =  estacionamento.getInstance();
		
		while(true){
			
			op = Integer.parseInt(JOptionPane.showInputDialog(park.getNome()+"\n1 - Entrada \n2 - Saída \n3 - Listar situação atual \n4 - Encerrar"));
			
			switch(op){
			
			case 1:
					String placa ="";
					String modelo="";
					placa = JOptionPane.showInputDialog("Digite o numero da placa:");
					modelo = JOptionPane.showInputDialog("Digite o modelo do veiculo:");
					veiculo veic = new veiculo(placa,modelo);
					boolean resp = park.entrada(veic);				
					if(resp == true)
						JOptionPane.showMessageDialog(null,"Veiculo " + veic.getModelo() + " estacionado com sucesso!");
					else
						JOptionPane.showMessageDialog(null,"Vagas Indisponiveis");
					break;
			case 2:
				placa = JOptionPane.showInputDialog("Digite o numero da placa: ");
				resp = park.saida(placa);
				if(resp == true)
					JOptionPane.showMessageDialog(null,"Veiculo [placa: "+placa+ "] deixou estacionamento");
				else
					JOptionPane.showMessageDialog(null,"Erro 404! Veiculo não estacionado!");
				break;
			case 3:
				park.getVagas();
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
