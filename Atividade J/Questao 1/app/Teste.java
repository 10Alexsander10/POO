package app;

import domain.AreaCalculavel;
import domain.Retangulo;

public class Teste {
	
	public static void main(String args[]){
		
		AreaCalculavel a = new Retangulo(3,2);
		System.out.println(a.calculaArea());
		
	}

}
