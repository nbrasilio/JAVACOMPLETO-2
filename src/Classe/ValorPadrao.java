package Classe;

public class ValorPadrao {
	// variáveis de classe ou de instâncias são inicializadas de forma implícita (assumem valores)
	static int a;
	static boolean b;
	
	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(b);
		
		// variável local tem que ser inicializada de forma explícita
		int b = 1;
		System.out.println(b);
		Object c = null;
		System.out.println(c);
	}

}
