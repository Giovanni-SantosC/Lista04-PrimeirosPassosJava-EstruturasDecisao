package lista04;

import java.util.Scanner;

public class Ex05VerificacaoAnoBissexto {

	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Verificador de Ano Bissexto: ");
		System.out.println("Digite um Ano: ");
		int ano = sc.nextInt();
		
		boolean bissexto = false;
		
		if(ano % 4 == 0) {
			if(ano % 100 != 0 || ano % 400 == 0) {
				bissexto = true;
			}
		}
		
		if(bissexto){
			System.out.println(ano + " é um ano Bissexto.");
		}
		else {
			System.out.println(ano + " Não é um ano Bissexto.");
		}
		
		sc.close();
	}

	
}
