import java.util.Scanner;


public class digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.format("Enter a five-digit number: " );
		
		int num = input.nextInt();
		
		int digit1 = num % 10;
		int digit2 = num/10 % 10;
		int digit3 = num/100 % 10;
		int digit4 = num/1000 % 10;
		int digit5 = num/10000 % 10;
		
		System.out.printf("Digits are : %d %d %d %d %d",
		digit5,digit4,digit3,digit2,digit1);
		input.close();
		
	}

}
