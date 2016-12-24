package capitulo3;

import java.util.Scanner;

public class quest7 {
	
	private static Scanner input;
	
	public static void main(String[]args){
		int num;
		input = new Scanner (System.in);
		System.out.print("Digite um valor inteiro: ");
		num = input.nextInt();
		
		for(;num > 1;){
			if(num % 2==0)
				num = num/2;
			else
				num = 3 * num +1;
			
		System.out.print("-> " + num);
		}
		
	}

}
