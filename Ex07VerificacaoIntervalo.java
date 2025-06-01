package lista04;

import java.util.Scanner;

public class Ex07VerificacaoIntervalo {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Verificação de Intervalo de 10 a 20:");
		System.out.println("Digite o Numero: ");
		int numero = sc.nextInt();
		
		if(numero >= 10 && numero <=20){
			System.out.println("Seu Valor " + numero + " Esta Dentro do Intervalo.");
		}
		else {
			System.out.println("Seu Valor " + numero + " Esta Fora do Intervalo.");
		}
		
		sc.close();
	}
	
}
