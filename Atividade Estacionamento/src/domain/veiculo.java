package domain;

public class veiculo {
	
	private String placa;
	private String modelo;
	
	public veiculo(String placa, String mod) {
		this.placa = placa;
		this.modelo = mod;
	}
	
	public String getPlaca(){
		return this.placa;
	}
	
	public String getModelo(){
		return this.modelo;
	}
	
	public String toString() {
		return "Veiculo [placa: " + placa + ", Modelo: " + modelo + "]\n";
	}
	
}