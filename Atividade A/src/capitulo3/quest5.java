package capitulo3;
import javax.swing.JOptionPane;

public class quest5 {
	public static void main(String args[]){
		int op;
		
			while(true){
				
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - Exerc�cio 1\n2 - Exerc�cio 2\n3 - Exerc�cio 3\n4 - Exerc�cio 4"));	
			switch(op){
			
			case 1:
				quest1.main(null);
				break;
			case 2:
				quest2.main(null);
				break;
			case 3:
				quest3.main(null);
				break;
			case 4:
				quest3.main(null);
				break;
			default:
				return;
			}
		
		}

	}
}