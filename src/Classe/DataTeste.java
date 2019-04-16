package Classe;

public class DataTeste {
	
	public static void main(String[] args) {
	 
		Data nascimento = new Data();
		nascimento.dia = 03;
		nascimento.mes = 11;
		nascimento.ano = 1962;
		
		System.out.println("NASCIMENTO:" + nascimento.formatar());
		
		Data casamento = new Data(07, 10, 1995);
		
		System.out.printf("CASAMENTO.:" + casamento.formatar());
		
	}

}
