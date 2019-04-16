package Classe;

public class Produto {
	// variáveis de instância (objeto)
	String nome;
	double preco;

	// variável da classe
	static double desconto;
	
	Produto() {
	}

	Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;		
	}
	
	double precoComDesconto() {
		return preco - (preco * desconto);	
	}
}