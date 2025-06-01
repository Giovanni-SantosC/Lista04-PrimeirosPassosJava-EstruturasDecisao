package lista04;

import java.util.Scanner;

public class Ex03VerificacaoNota {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Verificação de Nota: ");
        System.out.println("Digite uma Nota de 0 a 100:");
		double nota = sc.nextDouble();
		
		if(nota >= 60) {
			System.out.println("Com sua Nota " + nota + " Esta Aprovado.");
		}
		else {
			System.out.println("Com sua Nota " + nota + " Esta Reprovado.");
		}
		sc.close();
	}
	
}
