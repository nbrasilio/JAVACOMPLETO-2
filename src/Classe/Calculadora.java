package Classe;

public class Calculadora {
	double resultado;
	
	// recebe parâmeetro e retorna resultado
	double somar(double a, double b) {
		resultado = (a + b);
		return resultado;
	}
	
	// recebe parâmetro, mas não retorna resultado 
	void acrescentar(double a) {
		resultado += a;
	}
	// não recebe parâmetro, mas retorna resultado
	double obterResultado() {
		return resultado;
	}
	
	// não recebe parâmetro e não retorno resultado
	void limpar() {	
		resultado = 0;
	}
}
