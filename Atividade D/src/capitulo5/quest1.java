package capitulo5;

import java.util.*;
import javax.swing.JOptionPane;

public class quest1 {
	
	public static void main(String[] args){
		
		double[] notas = new double[5];
		double  soma = 0;
		String allnotas = "";
		
		for(int i = 0 ; i < notas.length; i++){
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (i+1) + "ª nota:"));
			soma += notas[i];
		}
		Arrays.sort(notas);
		int y = 1;
		for(int i = notas.length -1 ; i >=0 ; i--,y++)
			allnotas += ( y + "ª nota: " + notas[i] + "\n" );
		
		JOptionPane.showMessageDialog(null, allnotas + "média = " + (soma/notas.length));
		
	}

}
