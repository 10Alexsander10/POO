/*No código do exercício anterior, aumente a quantidade de números 
 * que terão os fatoriais impressos, até 20, 30, 40.
 * Em um determinado momento, além desse cálculo demorar,
 *  vai começar a mostrar respostas completamente erradas. Por quê?
 *  
 *  R = Pois o tipo int suporta apartir do numero -2.147.483.648 até 2.147.483.647 formados com 32 bits,
 *   e long -9.223.372.036.854.775.808L até 9.223.372.036.854.775.807 formado por 64 bits, qualquer numero
 *   que desobeceça estas limitações perderão sua precisão consequentemente sua validade. 
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