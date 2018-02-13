
import java.util.Scanner;

public class Circles {

	public static void main(String[] args) {
	
		
		Scanner input =  new Scanner (System.in);
		
		final double PI = 3.14159;
		
		int radius;  
		
		double area, diameter, circumference;
		System.out.print("Enter radius : ");
		radius = input.nextInt();
		diameter = 2 * radius;
		circumference = 2 * PI * radius;
		area = PI * radius * radius;
		System.out.printf("Radius = %d%n", radius);
		System.out.printf("Diameter = %.2f%n", diameter);
	    System.out.printf("Circumference = %.2f%n", circumference);
		System.out.printf("Area = %.2f", area);
		input.close();
	}

}
