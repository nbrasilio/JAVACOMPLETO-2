package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map <Integer, String> aprovados = new HashMap<>();
		aprovados.put(1,"Pedro");
		aprovados.put(2, "Maria");
		aprovados.put(3, "João");
		aprovados.put(4, "Rafael");
		
		System.out.println(aprovados.keySet());
		System.out.println(aprovados.values());
		System.out.println(aprovados.entrySet());
		
		System.out.println("Substituindo o valor da chave 3 com put");
		aprovados.put(3, "Beatriz");
		System.out.println(aprovados.get(3));
		System.out.println(aprovados.entrySet());
		
		System.out.println(aprovados.containsKey(4));
		System.out.println(aprovados.containsValue("Pedro"));
		
		System.out.println("Chaves...");
		for (Integer codigo: aprovados.keySet()) {
			System.out.println(codigo);
		}
		System.out.println("Valores...");
		for (String valor: aprovados.values()) {
			System.out.println(valor);
		}
		System.out.println("Chaves/Valores...");
		for (Entry<Integer, String> codigoValor: aprovados.entrySet()) {
			System.out.println(codigoValor); // ou
			System.out.println(codigoValor.getKey() + " " + codigoValor.getValue());
		}
	}

}
