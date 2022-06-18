/*
 * Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número]. 
 */

import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1;
		System.out.print("Informe um numero: ");
		num1 = sc.nextInt();
		System.out.printf("O Numero informado foi: %d", num1);
	}
}
