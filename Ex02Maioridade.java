package lista04;

import java.util.Scanner;

public class Ex02Maioridade {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Verificação de Maioridade: ");
		System.out.println("Digite sua Idade: ");
		int idade = sc.nextInt();
		
		if(idade < 18) {
			System.out.println("Sua idade " + idade + " é Menor." );
		}
		
		else {
			System.out.println("Sua idade " + idade + " é Maior.");
		}
		
		sc.close();
	}
	
}
