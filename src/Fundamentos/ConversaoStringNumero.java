package Fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
		String resposta1 = JOptionPane.showInputDialog("Qual é a nota 1?");
		String resposta2 = JOptionPane.showInputDialog("Qual é a nota 2?");
		
		System.out.println(resposta1 + resposta2);
		
		// Conversão string em double
		double nota1 = Double.parseDouble(resposta1);
		double nota2 = Double.parseDouble(resposta2);

		System.out.println((nota1 + nota2) / 2);
		
		double total = nota1 + nota2;
		System.out.println("TOTAL: " + total);
		
		double media = total /2;
		System.out.println("MEDIA:" + media);		
	}
	
}
