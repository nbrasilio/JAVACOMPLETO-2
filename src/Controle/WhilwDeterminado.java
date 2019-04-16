package Controle;

import java.util.Scanner;

public class WhilwDeterminado {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		
		int indice = 0;
		
		// INICIO DO LAÇO
		while(indice < 3) {
			nota = scanner.nextDouble();
			
			if (nota <=10 && nota >=0) {
				somaDasNotas += nota;
				indice ++;
			}	
		}
		//FINAL DO LAÇO
		
			scanner.close();
			double mediaDasNotas = somaDasNotas / indice;
			System.out.println("NUMERO DE NOTAS:" + indice);
			System.out.println("SOMA DAS NOTAS: " + somaDasNotas);
			System.out.printf("MEDIA CALCULADA: %.2f\n", mediaDasNotas);
			System.out.printf("A média é %.2f", somaDasNotas / indice);

		}
		

}
