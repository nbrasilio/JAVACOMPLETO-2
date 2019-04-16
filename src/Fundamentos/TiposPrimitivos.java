package Fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// tipo primitivo booleano
		boolean bo1 = false;
		boolean bo2 = true;
		
		System.out.printf("%b, %b\n", bo1, bo2);
		
		// tipo primitivo caractere
		char c1 = 'a';
		char c2 = '!';
		char c3 = '\u0050';
		
		System.out.printf("%c, %c, %c\n", c1, c2, c3);
		
		// tipos primitivos inteiros
		
		byte b1 = 127;
		short s1 = 32767;
		int i1 = 2_147_483_647;
		long l1 = 9_223_372_036_854_775_807L;
		
		System.out.printf("%d, %d, %d, %d\n", b1, s1, i1, l1);
		System.out.println(Integer.toBinaryString(b1));
		System.out.println(Integer.toBinaryString(s1));
		System.out.println(Integer.toBinaryString(i1));				
		System.out.println(Long.toBinaryString(l1));		
		
		// tipos primitivos reais (ponto flutuante)
		float f1 = 3.1416f;
		double d1 = 2.45;
		
		System.out.printf("%f, %f\n", f1, d1);
		System.out.printf("%.2f, %.1f%n", f1, d1);
		
		// BÁSCARA
		double a = 1.0, b = -3.0, c = -4.0;
		double x1 = (-b + Math.sqrt((b * b) - (4.0 * a * c))) / (2.0 * a);
		
		System.out.println(x1);
	}

}
