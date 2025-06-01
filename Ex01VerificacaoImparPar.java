package lista04;

import java.util.Scanner;

public class Ex01VerificacaoImparPar {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Verificação de Numero Impar ou Par: ");
		System.out.println("Digite um Numero Inteiro: ");
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Seu Numero " + numero + " e Par!");
		}
		
		else {
			System.out.println("Seu Numero " + numero + " e Impar!");
		}
		sc.close();
	}
	
}
