package capitulo3;

public class quest4 {
	
	public static void main(String[]args){
		int x;
		int y;
		for(x = 1; x <=10; x++){
			int fat = 1;
			for(y = x; y >= 1;y--)
				fat = fat * y;
		System.out.println("Fatorial de " + x + " = " + fat);
		}
	}

}
