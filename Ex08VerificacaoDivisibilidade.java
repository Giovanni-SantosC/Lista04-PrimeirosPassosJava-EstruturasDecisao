package lista04;

import java.util.Scanner;

public class Ex08VerificacaoDivisibilidade {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Verificação de Divisibilidade: ");
		System.out.println("Digite um Numero: ");
		int numero = sc.nextInt();
		
		if(numero % 3 == 0 && numero % 5 == 0) {
			System.out.println("Seu Numero " + numero + " é Divisivel por 3 e 5.");
		}
		
		else if(numero % 3 == 0) {
			System.out.println("Seu Numero " + numero + " é Divisivel por 3.");
		}
		
		else if(numero % 5 == 0 ) {
			System.out.println("Seu Numero " + numero + " é Divisivel por 5.");
		}
		
		else {
			System.out.println("Seu Numero " + numero + " Não é Divisivel por 3 e 5.");
		}
		
		sc.close();
	}
	
	
	
}
