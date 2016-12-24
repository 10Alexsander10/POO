package aplication;

import javax.swing.JOptionPane;

import Domain.Rectangle;

public class TestRectangle {
	
	public static void main(String[] args){
		Rectangle rectangle = new Rectangle();
		rectangle.width = 14.6;
		rectangle.height = 8.5;
		
		String result = "Area = " + rectangle.area();
		
		JOptionPane.showMessageDialog(null, result); 
		
	}

}
