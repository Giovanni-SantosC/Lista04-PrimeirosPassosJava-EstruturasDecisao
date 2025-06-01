package lista04;

import java.util.Scanner;

public class Ex10VerificacaoTriangulo {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[]cumprimentosTriangulo = new double [3];
		
		for(int i = 0; i < 3;i++) {
			System.out.println("Digite o "+ (i + 1) + "º Cumprimento do Triangulo:");
			double cumprimeto = sc.nextDouble();
			cumprimentosTriangulo[i] = cumprimeto;
		}
		
		if(cumprimentosTriangulo[0] + cumprimentosTriangulo[1] >cumprimentosTriangulo[2] &&
		   cumprimentosTriangulo[0] + cumprimentosTriangulo[2] >cumprimentosTriangulo[1] &&
		   cumprimentosTriangulo[1] + cumprimentosTriangulo[2] >cumprimentosTriangulo[0]) {
			System.out.println("Isso Forma um Triangulo");
		}
		
		else {
			System.out.println("Isso Não Forma um Triangulo");
		}
		sc.close();
	}
}
