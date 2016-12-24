package aplication;
import java.util.Scanner;

public class add{

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner (System.in);
		int num1;
		int num2;

		System.out.print("Digite um numero inteiro: ");
		num1 = input.nextInt();
		System.out.print("Digite outro inteiro:");
		num2 = input.nextInt();
		System.out.print("Soma = " + (num1 + num2));

	}
}
