package capitulo5;

import java.util.*;

public class quest4 {
	
	public static void main(String[] args){
		int[] par = new int[10];
		int[] impar = new int[10];
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			int num = rand.nextInt(21) + 1;
			if(num % 2 == 0)
				par[i] = num;
			else
				impar[i] = num;
		}
		
		System.out.println("------Numeros Pares------");
		for(int i = 0; i < 10; i++)
			if(par[i] != 0)
				System.out.println(par[i]);
		System.out.println("------Numeros Impares------");
		for(int i = 0; i < 10; i++)
			if(impar[i] != 0)
				System.out.println(impar[i]);
		
	}

}
