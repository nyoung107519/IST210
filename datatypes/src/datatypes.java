import java.util.Scanner;

public class datatypes {

	public static void main(String[] args) {
		System.out.println("hello world");

		byte byt = 'P';		
		short sh = 16;
		int myint = 10;

		System.out.format("**** Part1: ****\n");
		System.out.printf("Byte = %c\n", byt);		
		System.out.printf("Short = %d\n", sh);
		System.out.printf("Int = %d\n", myint);

		
		System.out.format("\n\n**** Part2: ****\n");
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a byte: ");
		byt = input.nextByte();
		System.out.printf("Byte = %c\n", byt);


		
		
		input.close();
		
		
	}

}
