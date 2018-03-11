import java.util.Scanner;


public class Coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		
		System.out.print(" please enter pennies:");
		
		int pennies = input.nextInt();
		int o = pennies;
		
		int dollars = pennies / 100;
		pennies = pennies % 100;
		

		int Quarters = pennies / 25;
		pennies = pennies % 25;
		

		int dimes = pennies / 10;
		pennies = pennies % 10;
		

		int Nickels = pennies / 5;
		pennies = pennies % 5;
		
		System.out.printf("Original amount: %d\n", o);
		System.out.printf("Number of Dollars: %d\n" , dollars);
		System.out.printf("Number of Quarters: %d\n", Quarters);
		System.out.printf("Number of dimes: %d\n", dimes);
		System.out.printf("Number of Nickles: %d\n", Nickels);
		
		input.close();
		
		
	}

}
