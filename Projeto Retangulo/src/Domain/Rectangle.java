package Domain;

import static java.lang.Math.*;

public class Rectangle {
	
	public double width;
	public double height;
	public point P_Origem;
	
	public double area(){
		
		return this.height * this.width;
	}
	
	public double perimeter(){
		return 2 * this.width + 2 * this.height;
	}
	
	public boolean contains(Rectangle rect2){
		if(sqrt(pow(rect2.P_Origem.x - (this.P_Origem.x + this.width),2)) <= sqrt(pow(this.P_Origem.x - (this.P_Origem.x + this.width),2))){
            if(sqrt(pow(rect2.P_Origem.y - (this.P_Origem.y + this.height),2)) <= sqrt(pow(this.P_Origem.y - (this.P_Origem.y + this.height),2))){
                return true;
            }
        }
		
		return false;
	}

	

}
