package capitulo3;

import java.util.Scanner;

public class quest8{
	
	private static Scanner input;
	
	public static void main(String[]args){
		int num;
		input = new Scanner (System.in);
		System.out.print("Digite um valor inteiro: ");
		num = input.nextInt();
		
		for(int x = 1; x <= num ; x++){
			for(int y = 1; y <= x ; y++)
				System.out.print(x*y + " ");
		System.out.println();
		}
			
		
	}

}
