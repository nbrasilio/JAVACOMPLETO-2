package oo.heranca;

public class TestDrive {
	
	public static void main(String[] args) {
		Carro c = new Civic();
		c.acelerar();
		System.out.println("Civic.....Velocidade Máxima:" + c.VELOCIDADE_MAXIMA);
		System.out.println(c.getVelocidadeAtual());
		c.acelerar();
		System.out.println(c.getVelocidadeAtual());
		
		c = new Ferrari();
		c.acelerar();
		System.out.println("Ferrari...Velocidade Máxima:" + c.VELOCIDADE_MAXIMA);
		System.out.println(c.getVelocidadeAtual());
		c.acelerar();
		System.out.println(c.getVelocidadeAtual());
		
	}

}
