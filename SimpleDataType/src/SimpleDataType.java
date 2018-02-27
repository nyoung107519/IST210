
import java.util.Scanner;


public class SimpleDataType {
	





	public static void main(String[] args) { 
	
		byte byt ='P';
		short sh = 16;
		int i = 10;
		long l = 64;
		float x = 88133.123456789012345678F;
		
		double d = 33777.123456789012345678;
		
		char ch = 'X';
		String str = "myString";
		boolean bool = true;
		Object obj = "myObject";
		
		System.out.format("**** Part1: ****%n");
		System.out.printf("Byte = %c%n", byt);
		System.out.printf("Short = %d%n", sh);
		System.out.printf("int = %d%n", i);
		
		System.out.format("Long = %d%n", l);
		System.out.printf("Float = %f%n", x);
		
		System.out.printf("Double = %.15f%n", d);
		
		System.out.printf("Char = %c%n", ch);
		System.out.printf("String = %s%n", str);
		
		System.out.printf("Boolan = %B%n", bool);
		
		System.out.printf("Object = %s%n", obj);
						
		System.out.format("\n\n**** Part2: ****\n");
		Scanner input = new 
		Scanner(System.in);
		
		System.out.print("Enter a Byte: ");	
		byt = input.nextByte();
		System.out.printf("Byte = %c%n", byt);
		
  		System.out.print("Enter a Int: ");	
		i = input.nextInt();
		System.out.printf("Int = %c%n", i);
		
		System.out.print("Enter a Int16: ");	
		sh = input.nextShort();
		System.out.printf("Int16 = %c%n", sh);
		
		System.out.print("Enter a Long Int: ");	
		l = input.nextLong();
		System.out.printf("Long = %c%n", i);
		
		System.out.print("Enter a Float: ");	
		x = input.nextFloat();
		System.out.printf("Float = %c%n", x);
		
		System.out.print("Enter a Double: ");	
		d = input.nextDouble();
		System.out.printf("Double = %c%n", d);
		
		System.out.print("Enter a Char: ");	
		ch = input.next().charAt(0);
		System.out.printf("First char = %c%n", ch);
		
		System.out.print("Enter a String: ");
		String str1 = input.next();
		System.out.printf("String = %s%n", str1);
		
		System.out.print("Enter a Boolean (true/false): ");
		bool = input.nextBoolean();
		System.out.printf("Boolean (uppercase) =%B%n", bool);
		
		System.out.print("Enter a String: ");
		obj = input.next();
		System.out.printf("Object = %s%n", obj);

		input.close();
	}
}






