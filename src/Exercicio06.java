/*
 * Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 */
import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double raio, area;
		System.out.println("Informe o Raio do Circulo: ");
		raio = sc.nextFloat();
		area = Math.PI * Math.pow(raio, 2);
		System.out.printf("A area do Circulo eh: %.4f", area);	
	}
}
