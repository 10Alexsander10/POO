package capitulo5;

import java.util.*;

public class quest3 {
	
	public static void main(String[] args){
		
		int[][] imagem = new int[40][40];
		String allpixels = "";
		Random rand = new Random();
		
		int cont = 1;
		for (int i = 0 ; i < 40 ; i++)
			for(int y = 0 ; y < 40 ; y++){
				imagem[i][y] = rand.nextInt(256);
				allpixels += ( cont + "º pixel: " + imagem[i][y] + "\n" );
				cont ++;
			}		
		
		System.out.println(allpixels);
		
	}

}
