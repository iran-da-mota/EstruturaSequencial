/*
 * Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
 * a. o produto do dobro do primeiro com metade do segundo .
 * b. a soma do triplo do primeiro com o terceiro.
 * c. o terceiro elevado ao cubo.
 */


import java.util.Locale;
import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		double num3;
		
		System.out.println("Informe dois numeros inteiros: ");
		num1 =  sc.nextInt();
		num2 = sc.nextInt();		
		System.out.println("Informe um numero real: ");		
		num3 = sc.nextDouble();
		int produto = ((2*num1)*(num2/2));
		double triplo = num1;	
		double soma = (3 * triplo) + num3;
		double cubo = Math.pow(num3, 3);
		
		System.out.printf("O produto do dobro de %d vezes a metado de %d eh: %d", num1, num2, produto);
		System.out.printf("\nA soma do triplo de %d mais %.2f eh: %.2f", num1, num3, soma);
		System.out.printf("\n%.2f elevado ao cubo eh: %.2f", num3, cubo);
	}
}
