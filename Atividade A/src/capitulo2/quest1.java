package capitulo2;
import java.io.*;

public class quest1 {
	
	public static void main(String args[]) throws IOException{
	String s;
	double val_prod,per_desc;
	BufferedReader dado;
	System.out.print("Digite o valor do produto: ");
	dado = new BufferedReader(new InputStreamReader(System.in));
	s = dado.readLine();
	val_prod = Double.parseDouble(s);
	
	System.out.print("Digite a porcentagem do desconto: ");
	dado = new BufferedReader(new InputStreamReader(System.in));
	s = dado.readLine();
	per_desc = Double.parseDouble(s);
	
	System.out.println("valor do desconto: " + (val_prod * per_desc)/100);
	System.out.println("valor do produto com o desconto: " + (val_prod - (val_prod * per_desc/ 100)));
	
	}
}
