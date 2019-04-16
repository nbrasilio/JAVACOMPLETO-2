package Colecoes;

public class ForEach {
	
	public static void main(String[] args) {
		double[] notasJoao = { 7.0, 8.7, 6.2, 4.9, 9.7 };

		double[] notasPedro = new double[5];
		notasPedro[0] = 7.0;
		notasPedro[1] = 8.7;
		notasPedro[2] = 6.2;
		notasPedro[3] = 4.9;
		notasPedro[4] = 9.7;

		double totalJoao = 0;
		for(double nota: notasJoao) {
			totalJoao += nota;
		}

		double totalPedro = 0;
		for(double nota: notasPedro) {
			totalPedro += nota;
		}

		System.out.println("Total João :" + totalJoao);
		System.out.println("Média João :" + totalJoao / notasJoao.length);
		System.out.println("Total Pedro:" + totalPedro);
		System.out.println("Média Pedro:" + totalPedro / notasPedro.length);
			
	}

}
