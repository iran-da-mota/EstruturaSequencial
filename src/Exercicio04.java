/*
 * Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 */
import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		double media, nota1, nota2, nota3, nota4;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe as notas bimestrais do aluno: ");
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();
		nota4 = sc.nextDouble();
		media = (nota1+nota2+nota3+nota4)/4;
		System.out.printf("O aluno ficou com: %.2f de Media", media);
	}
}
