package Fundamentos;

public class OperadorTernario {
	
	public static void main(String[] args) {
		
		double nota1 = 6.9;
		double nota2 = 8.9;
		
		String resultado1 = nota1 >= 7 ? "Aprovado" : "Recuperação";
		String resultado2 = nota2 >= 7 ? "Aprovado" : "Recuperação";
		System.out.println("Resultado1:" + resultado1);
		System.out.println("Resultado2:" + resultado2);
		
	}

}
