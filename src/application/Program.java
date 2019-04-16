package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//USANDO CONCEITO DE SOBRECARGA MOSTRANDO O CONSTRUTOR PADRÃO (SEM ARGUMENTOS)
		Product prod = new Product();

		System.out.println();
		System.out.println("Product data: " + prod);
		System.out.println();

		//USANDO CONCEITO DE SOBRECARGA MOSTRANDO O CONSTRUTOR SEM A QUANTIDADE PREENCHIDA (2 ARGUMENTOS)
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);
		
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		
		product.setPrice(500.00);
		System.out.println("Updated price: " + product.getPrice());
				
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
 
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		
		//USANDO CONCEITO DE SOBRECARGA MOSTRANDO O CONSTRUTOR COM A QUANTIDADE PREENCHIDA (3 ARGUMENTOS)
 
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		sc.nextLine();
		String name2 = sc.nextLine();
		
		System.out.print("Price: ");
		double price2 = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity2 = sc.nextInt();
		Product product2 = new Product(name2, price2, quantity2);

		System.out.println();
		System.out.println("Product data: " + product2);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");

		quantity2 = sc.nextInt();
		product2.addProducts(quantity2);
		
		System.out.println();
		System.out.println("Updated data: " + product2);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity2 = sc.nextInt();
		product2.removeProducts(quantity2);
		
		System.out.println();
		System.out.println("Updated data: " + product2);
		
		sc.close();
	}
}