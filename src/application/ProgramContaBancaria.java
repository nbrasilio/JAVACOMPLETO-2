package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class ProgramContaBancaria {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria contaBancaria;
		
		System.out.print("Entre com o número da conta: ");
		int numeroDaConta = sc.nextInt();
		
		System.out.print("Entre com o Nome do cliente: ");
		sc.nextLine();
		String nomeDoCliente = sc.nextLine();
		
		System.out.print("Fará depósito incial (s/n):");
		char flagDepositoInicial = sc.next().charAt(0);
		
		if (flagDepositoInicial == 's') {
			System.out.print("Entre com o valor do depósito: ");
			double depositoInicial = sc.nextDouble();
			contaBancaria = new ContaBancaria(numeroDaConta, nomeDoCliente, depositoInicial);
		}
		else {
			contaBancaria = new ContaBancaria(numeroDaConta, nomeDoCliente);
		}
					
		System.out.println();
		System.out.print("Dados da Conta: " + contaBancaria);
		System.out.println();
		
		System.out.print("Entre com o valor do depósito:");
		double valorDoDeposito = sc.nextDouble();
		
		contaBancaria.somaDeposito(valorDoDeposito);
				
		System.out.println();
		System.out.println("Dados atualizados: " + contaBancaria);
		System.out.println();
		
		System.out.print("Entre com o valor do saque: ");
		double valorDoSaque = sc.nextDouble();
		contaBancaria.abateSaque(valorDoSaque);
		
		System.out.println();
		System.out.println("Dados atualizados: " + contaBancaria);
		System.out.println();	
		
		sc.close();
	}

}