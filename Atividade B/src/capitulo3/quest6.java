package capitulo3;

public class quest6 {
	
	public static void main(String[]args){
	
	int aux1 = 0, aux2 = 1, num = 0;
	
		for(int i = 3; num <= 100 ; i++){
			num = aux1 + aux2;
			aux1 = aux2;
			aux2 = num;
			if(i==3)
				System.out.println("0\n" + num);
			else
				System.out.println(num);
		}

	}
		
}

