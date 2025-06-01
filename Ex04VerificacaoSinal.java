package lista04;

import java.util.Scanner;

public class Ex04VerificacaoSinal {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Verificação de Sinal Número: ");
		System.out.println("Digite um Numero: ");
		double numero = sc.nextDouble();
		
		if(numero > 0) {
			System.out.println("Seu Numero " + numero + " é Positivo.");
		}
		else if(numero == 0) {
			System.out.println("Seu Numero " + numero + " é Zerado");
		}
		else {
			System.out.println("Seu Numero " + numero + " é Negativo");
		}
		
		sc.close();
	}
	
}
