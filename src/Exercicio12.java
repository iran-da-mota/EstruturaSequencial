/*
 * Tendo como dados de entrada a altura de uma pessoa, 
 * construa um algoritmo que calcule seu peso ideal, 
 * usando a seguinte fórmula: (72.7*altura) - 58
 */
import java.util.Locale;
import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe seu peso: ");
		double peso =sc.nextDouble();
		System.out.print("Informe sua altura: ");
		double altura = sc.nextDouble();
		double pesoIdeal = (72.7 * altura) - 58;
		double imc = peso/(altura*altura);
		System.out.printf("Seu IMC eh: %.2f", imc);
		System.out.printf("\nSeu peso Ideal eh: %.2f", pesoIdeal);
	}

}
