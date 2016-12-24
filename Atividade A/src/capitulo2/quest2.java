package capitulo2;
import  java.util.Scanner;

public class quest2 {
	
	private static Scanner input;
	
	
	public static void main(String[]args){
		int pontos_lid,pontos_lan;
		input = new Scanner (System.in);
		System.out.print("Digite os pontos do lider: ");
		pontos_lid = input.nextInt();
		
		System.out.print("Digite os pontos do lanterna: ");
		pontos_lan = input.nextInt();
		
		System.out.println("Numero de vitorias necessarias = " + ((pontos_lid-pontos_lan)/3));
		
		
		
		
	}
}
