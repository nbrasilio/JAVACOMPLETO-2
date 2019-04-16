package Colecoes;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
		// ---------------------------------------------------------------------------------
		// a estrutura abaixo possui as funcionalidades de fila e de pilha, podendo ser 
		// usada caso precisemos usar FIFO e LIFO simultaneamente (pop, poll, etc)
		//----------------------------------------------------------------------------------
		//		Deque<String> pilha = new ArrayDeque<>();
		//----------------------------------------------------------------------------------
		pilha.push("Pequeno Principe");
		pilha.push("O Hobbit");
		pilha.push("Don Quixote");
		
		System.out.println("Peek...");
		System.out.println(pilha.peek());
		
		System.out.println("Pop...");
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		//System.out.println(pilha.pop()); cancela quando não tem mais nada na pilha
	}
}
