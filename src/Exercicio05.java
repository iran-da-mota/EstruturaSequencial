/*
 * Faça um Programa que converta metros para centímetros.
 */
import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double metro, centimetro;
		System.out.println("Programa para converter de Metro para Centimetro");
		System.out.println("Informe a medida em metro: ");
		metro = sc.nextDouble();
		centimetro = metro * 100;
		
		System.out.printf("%.2fm em Centimetro eh: %.0fcm", metro, centimetro);		
	}
}
