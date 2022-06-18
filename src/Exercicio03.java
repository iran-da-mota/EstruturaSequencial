/*
 * Faça um Programa que peça dois números e imprima a soma.
 */
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, soma;
		System.out.println("Informe dois numeros: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		soma = num1 + num2;
		
		System.out.printf("A soma dos valores eh: %d",  soma);
	}
}
