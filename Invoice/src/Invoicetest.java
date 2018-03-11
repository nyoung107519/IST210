
public class Invoicetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Invoice invoice1 = new Invoice("1234", "Hammer", 2, 14.95);
		
		System.out.printf("Original Invoice\n");
		
		System.out.printf("Part number: %s\n", invoice1.getPartNum());
		
		System.out.printf("Description: %s\n", invoice1.getDescription());
		
		System.out.printf("Quantity: %d\n", invoice1.getQuantity());
		
		System.out.printf("Price: %.2f\n",invoice1.getPrice());
		
		System.out.printf("Invoice Amount: %.2f\n", invoice1.getInvoiceAmount());
		
		


	}

}
