package api;

public class ExplorandoStringBuilder {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Joao");
		sb.append(",").append("Maria");
		sb.append(",").append("Pedro");
		
		// É mutável
		System.out.println(sb.toString());
		sb.reverse();
		System.out.println(sb.toString());
	}

}
