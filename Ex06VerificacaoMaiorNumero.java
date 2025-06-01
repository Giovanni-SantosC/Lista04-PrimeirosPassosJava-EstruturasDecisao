package lista04;

import java.util.Scanner;

public class Ex06VerificacaoMaiorNumero {

	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);

		int[]numerosInseridos = {0,0,0};		
		
		System.out.println("Verificação de Maior Numero: ");
		for(int i = 0; i < 3; i++) {
			System.out.println("Digite o " + (i + 1) + "º Valor:");
			int numero = sc.nextInt();
			numerosInseridos[i] = numero;
			
		}
		
		int maiorNumero = numerosInseridos[0];
		
		if(numerosInseridos[1] > maiorNumero) {
			maiorNumero = numerosInseridos[1];
			
		}
		
		if(numerosInseridos[2] > maiorNumero) {
			maiorNumero = numerosInseridos[2];
		}
		
		System.out.println("O Maior Numero é: " + maiorNumero);
		
		sc.close();
	}
	
}
