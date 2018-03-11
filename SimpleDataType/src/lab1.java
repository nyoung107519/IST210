import java.util.Scanner;

public class lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte byt = 'P';
		short sh = 16;
		int myint = 10;
		long mylo = 64;
		float myfl = (float) 88133.125000;
		double mydub = 3377.123456789012400;
		char mych = 'X';
		String myStr = "myString";
		boolean mybo = true;
		
		System.out.format("**** Part1: ****\n");
		System.out.printf("Byte = %c\n", byt);
		System.out.printf("Short = %d\n", sh);
		System.out.printf("int = %d\n", myint);
		System.out.printf("long = %d\n", mylo);
		System.out.printf("float = %f\n", myfl);
		System.out.printf("double = %.15f\n", mydub);
		System.out.printf("char = %c\n", mych);
		System.out.printf("String = %s\n", myStr);
		System.out.println("boolean = " + String.valueOf(mybo).toUpperCase());
		
		
		
		System.out.format("\n\n**** Part2: ****\n");
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter a byte: ");
		byt = input.nextByte();
		System.out.printf("Byte = %c\n", byt);

		System.out.print("Enter a Short: ");
		sh = input.nextShort();
		System.out.printf("Short = %d\n", sh);
		
		System.out.printf("Enter a Int: ");
		myint = input.nextInt();
		System.out.printf("int = %d\n", myint);
		
		System.out.printf("Enter a Long: ");
		mylo = input.nextLong();
		System.out.printf("long = %d\n", mylo);
		
		System.out.printf("Enter a Float: ");
		myfl = input.nextFloat();
		System.out.printf("float = %f\n", myfl);
		
		System.out.printf("Enter a Double: ");
		mydub = input.nextDouble();
		System.out.printf("double = %.15f\n", mydub);
		
		System.out.printf(" Enter a String : ");
		input.nextLine();
		mych = input.nextLine().charAt(0);
		System.out.printf("char = %c\n", mych);
		
		System.out.printf("Enter a String: ");
		myStr = input.nextLine();
		System.out.printf("String = %s\n", myStr);
		
		System.out.printf("Enter a Boolean: ");
		mybo = input.nextBoolean();
		System.out.println("boolean = " + String.valueOf(mybo).toUpperCase());
		
		
		
		System.out.println("Done...");
		input.close();
	}

}
