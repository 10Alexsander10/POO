package aplication;

import javax.swing.JOptionPane;

import Domain.Rectangle;
import Domain.point;

public class principal {
	
	public static void main(String[] args){
		
		String menu = "##### RT #####";
		menu += "\n 1 - Configurar Rect1";
		menu += "\n 2 - Configurar Rect2";
		menu += "\n 3 - Area do Rect1";
		menu += "\n 4 - Area do Rect2";
		menu += "\n 5 - Perimetro Rect1";
		menu += "\n 6 - Perimetro Rect2";
		menu += "\n 7 - Verificar se Rect2 inicia em Rect1";
		menu +="\n 0 - Sair ";
		
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		
		int op = -1;
		
		while(op != 0){
			
			op = getInt(menu);
		
		switch(op){
			case 1:
				rect1.height = getDouble("altura: ");
				rect1.width = getDouble("largura: ");
				rect1.P_Origem = new point();
				rect1.P_Origem.x = getDouble("Rect1 x: ");
				rect1.P_Origem.y = getDouble("Rect1 y: ");
				break;
			
			case 2:
				rect2.height = getDouble("altura: ");
				rect2.width = getDouble("largura: ");
				rect2.P_Origem = new point();
				rect2.P_Origem.x = getDouble("Rect2 x: ");
				rect2.P_Origem.y = getDouble("Rect2 y: ");
				break;
				
			
			case 3:
				showMsg("Rect1 Area: " + rect1.area());
				break;
				
			case 4:
				showMsg("Rect2 Area: " + rect2.area());
				break;
				
			case 5:
				showMsg("Rect1 Perimetro: " + rect1.perimeter());
				break;
				
			case 6:
				showMsg("Rect1 Perimetro: " + rect2.perimeter());
				break;
				
			case 7:
				
				if (rect1.contains(rect2)){
					showMsg("Sim.");
				}else{
					showMsg("Nao.");
				}
				break;
			case 0:
				break;
				
			default:
				showMsg("Entrada Invalida.");
				break;
				
		   }
		
		}
		
	}
	
	private static void showMsg(String menu) {
		JOptionPane.showMessageDialog(null, menu);
	}
	
	private static int getInt(String msg){
		return Integer.valueOf(JOptionPane.showInputDialog(msg));
	}
	
	private static double getDouble(String msg){
		
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}
}
		
