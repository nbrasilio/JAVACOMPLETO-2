package curso2019;

public class Split {

	public static void main(String[] args) {
		
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println("String original:" + s);
		System.out.println("Palavra 1:" + word1);
		System.out.println("Palavra 2:" + word2);
		System.out.println("Palavra 3:" + word3);

	}

}
