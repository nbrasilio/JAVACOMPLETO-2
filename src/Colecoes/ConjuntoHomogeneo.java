package Colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoHomogeneo {
	
	public static void main(String[] args) {
//		Set<String> aprovados = new HashSet<>(); NÃO RESPEITA A ORDEM DE INSERÇÃO
//		Set<String> aprovados = new LinkedHashSet<>(); //RESPEITA A ORDEM DE INSEÇÃO
		Set<String> aprovados = new TreeSet<>(); //ORDEM DO TIPO ATRIBUTO (ALFABÉTICA, NUMÉRICA)
		aprovados.add("Joao");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
			
		for(String nome: aprovados) {
			System.out.println(nome);
		}
	}

}
