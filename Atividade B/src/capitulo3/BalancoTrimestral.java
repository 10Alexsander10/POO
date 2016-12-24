package capitulo3;

public class BalancoTrimestral {
	
	public static void main(String[]args){
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		double mediaMensal = (gastosJaneiro + gastosFevereiro + gastosMarco)/3;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.println(gastosTrimestre);
		System.out.println("Valor da média mesal = " + mediaMensal);
		
	}

}
