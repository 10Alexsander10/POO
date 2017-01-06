package capitulo5;
import java.util.*;
import javax.swing.JOptionPane;

public class quest2 {
	
	public static void main(String[] args){
		
		String[] meses = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
		int num = 0 ;
		Random rand = new Random();
		
		for (int i = 0; i < 10; i++) 
			num = rand.nextInt(13);
		
		JOptionPane.showMessageDialog(null, meses[num]);
	}
}
