package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		Set conjunto = new HashSet();
		conjunto.add('a');
		conjunto.add("Texto");
		conjunto.add(1);
		conjunto.add(3.14);
		conjunto.add(false);
		
		System.out.println("Add...");
		System.out.println(conjunto.add(1)); // não foi adicionado porque é repetido
		System.out.println(conjunto.add(10));
		System.out.println("Size: " + conjunto.size() + " elemento(s)");
		
		System.out.println("Remoções...");
		System.out.println(conjunto.remove('a'));
		System.out.println("Size: " + conjunto.size() + " elemento(s)");
		
		System.out.println("Contains...");
		System.out.println(conjunto.contains('a'));
		System.out.println(conjunto.contains("Texto"));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		//intercessão de dois conjuntos
		conjunto.retainAll(nums);
		System.out.println("Size: " + conjunto.size() + " elemento(s)");
		
		//união de dois conjuntos
		conjunto.addAll(nums);
		System.out.println("Size: " + conjunto.size() + " elemento(s)");
		
		//limpeza do conjunto
		conjunto.clear();
		System.out.println(conjunto.isEmpty());
		System.out.println("Size: " + conjunto.size() + " elemento(s)");
		
	}
}
