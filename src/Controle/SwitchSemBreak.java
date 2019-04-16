package Controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		String faixa = "branca";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Executa Katás da faixa preta");
		case "marrom":
			System.out.println("Executa Katás da faixa marrom");		
		case "roxa":
			System.out.println("Executa Katás da faixa roxa");
		case "verde":
			System.out.println("Executa Katás da faixa verde");			
		case "laranja":
			System.out.println("Executa Katás da faixa laranja");
		case "vermelha":
			System.out.println("Executa Katás da faixa vermelha");
		case "amarela":
			System.out.println("Executa Katás da faixa amarela");	
		default:
			System.out.println("Executa Katás da faixa branca");	
			
		}
		
	}
	
	
}
