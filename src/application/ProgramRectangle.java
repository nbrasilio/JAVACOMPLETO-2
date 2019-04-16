package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ProgramRectangle {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle r;
		r = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		r.width = sc.nextDouble();
		r.height = sc.nextDouble();
		
		double area = r.area();
		double perimeter = r.perimiter();
		double diagonal = r.diagonal();

		System.out.printf("Area: %.2f%n", area);
		System.out.printf("Perimiter: %.2f%n", perimeter);
		System.out.printf("Diagonal: %.2f%n", diagonal);
		sc.close();
		}		
}