package Controle;

public class IfElseIfElse {
	
	public static void main(String[] args) {
		
		double nota = 3.5;
		
		if(nota >= 9) {
			System.out.println("Quadro de honra!");
		} else if(nota > 7.0) {
			System.out.println("Aprovado");
		} else if(nota >= 5.5) {
			System.out.println("Recuperação");
		} else if(nota >= 3.5) {
			System.out.println("Recuperação + trabalho");
		} else {
			System.out.println("Reprovado");
		}
		
	}

}
