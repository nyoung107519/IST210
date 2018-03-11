public class Invoice {

	private String partNum;
	private String description;
	private int quantity;
	private double price;
	
	public Invoice(String partNum, String description, int quantity, double price)
	{
		this.partNum = partNum;
		this.description = description;
		this.quantity = quantity;
		
		
		if(price > 0.0)
			this.price = price;
	}
	public void price(double priceAmount){
		if(priceAmount > 0.0)
			price =  priceAmount;
	}
	public double getPrice(){
		return price;
	}
	public void setPartNum(String partNum){
		this.partNum = partNum;
	}
	public String getPartNum(){ 
		return partNum;
	}
	 public double getInvoiceAmount(){
		 return quantity * price;
	 }
	 public  int getQuantity(){
		 return quantity;
	 }
	 public String getDescription(){
		 return description;


	 }
	 }
