package lista04;

import java.util.Scanner;

public class Ex09VerificacaoVogalConsoante {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Verificação de Vogal ou Consoante");
		System.out.println("Digite uma Letra: ");
		String input = sc.next().toLowerCase();
		char letra = input.charAt(0);
		
		if(input.length() != 1 || !Character.isLetter(letra)) {
			System.out.println("Digite Apenas Letra.");
		}
		else if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println(letra + " é uma Vogal.");
		}
		else {
			System.out.println(letra + " é uma Consoante.");
		}
		
		sc.close();
	}
	
}
