package entities;

public class ContaBancaria {

	private int numeroDaConta;
	private String nomeDoCliente;
	private double saldoDaConta;
	private static final double taxa = 5.00;

	public ContaBancaria() {
	}
	
	
	public ContaBancaria(int numeroDaConta, String nomeDoCliente, double depositoInicial) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoCliente = nomeDoCliente;
		somaDeposito(depositoInicial);
	}

	public ContaBancaria(int numeroDaConta, String nomeDoCliente) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoCliente = nomeDoCliente;
	}

	public void somaDeposito(double valorDoDeposito) {
		this.saldoDaConta += valorDoDeposito;
	}

	public void abateSaque(double valorDoSaque) {
		this.saldoDaConta -= (valorDoSaque + taxa);
	}
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	public double getSaldoDaConta() {
		return saldoDaConta;
	}

	public String toString() {
		return  "Conta: " + numeroDaConta
				+ ", Nome: " + nomeDoCliente 
				+ ", Saldo: $" + String.format("%.2f", saldoDaConta);	
	}

}
