package domain;

import javax.swing.JOptionPane;
import domain.veiculo;

public class estacionamento {
	
	private static estacionamento instance;
	private String nome;
	private veiculo[] vagas;
	
	private estacionamento(){
		this.nome = "Parking";
		this.vagas = new veiculo[10];
	}
	
	public static estacionamento getInstance(){
		if(estacionamento.instance == null)
			estacionamento.instance = new estacionamento();
		
		return estacionamento.instance;
	}
	
	public boolean entrada(veiculo Veiculo){
		
		for(int i = 0; i < vagas.length; i++){
			if(vagas[i] == null)
				if(!contem(Veiculo.getPlaca())){					
					vagas[i] = Veiculo;
					return true;
					}
				else
					JOptionPane.showMessageDialog(null,"Veiculo já Estacionado!");
			}
		return false;
	
	}
	private boolean contem(String placa){
		
		for (veiculo Veiculo : vagas)
			if (Veiculo != null)
				if(Veiculo.getPlaca().equals(placa))
					return true;
		
		return false;
	}
	
	public boolean saida(String placa){
		for(int i = 0;i < vagas.length; i++)
			if(this.vagas[i] != null)
				if(this.vagas[i].getPlaca().equals(placa)){
					this.vagas[i] = null;
					return true;
		}
		
		return false;

		
	}
	
	public void getVagas(){
		String ap = " ";
		for(int i = 0; i < vagas.length; i++)
			if(this.vagas[i] != null)
				ap += vagas[i].toString();
		JOptionPane.showMessageDialog(null,ap);
	}
	public String getNome(){
		return this.nome;
	}
}
