



public class Employee {

	
	
	private String firstName;
	private String lasttName;
	private double monthlySalary;
	
	public Employee(String firstName, String lasttName, double monthlySalary) {
		super();
		this.firstName = firstName;
		this.lasttName = lasttName;
		this.monthlySalary = monthlySalary;
	}
	 
	public String getFirstName() {
		return firstName;
	}

	
	
	 
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	
	
	public String getLasttName() {
		return lasttName;
	}


	
	 
	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}


	
	 
	 
	public double getMonthlySalary() {
		return monthlySalary;
	}
	 
	 
	public void setMonthlySalary(double monthlySalary) {	
	if(monthlySalary > 0.0)
		this.monthlySalary = monthlySalary;
	
	}

	
	public String toString() {
	return 	String.format("%s %s,Yearly Salary: $%,.2f",firstName, lasttName,   monthlySalary);
		
	}
	
	
	public double getYearlySalary(){
		return monthlySalary * 12.00;
	}
	
	
	
	public void givePayRaise(double r){
		double yearlySalary = monthlySalary *12;
		double yearlySalarywithRaise = (yearlySalary * r/100) + yearlySalary;
		this.monthlySalary = yearlySalarywithRaise / 12;
	}
	
	
	
}

