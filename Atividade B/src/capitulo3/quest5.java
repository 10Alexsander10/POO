/*No c�digo do exerc�cio anterior, aumente a quantidade de n�meros 
 * que ter�o os fatoriais impressos, at� 20, 30, 40.
 * Em um determinado momento, al�m desse c�lculo demorar,
 *  vai come�ar a mostrar respostas completamente erradas. Por qu�?
 *  
 *  R = Pois o tipo int suporta apartir do numero -2.147.483.648 at� 2.147.483.647 formados com 32 bits,
 *   e long -9.223.372.036.854.775.808L at� 9.223.372.036.854.775.807 formado por 64 bits, qualquer numero
 *   que desobece�a estas limita��es perder�o sua precis�o consequentemente sua validade. 
 */
package capitulo3;

public class quest5 {
	
	public static void main(String[]args){
		long x;
		long y;
		for(x = 1; x <=40; x++){
			long fat = 1;
			for(y = x; y >= 1;y--)
				fat = fat * y;
		System.out.println("Fatorial de " + x + " = " + fat);
		}
	}

}