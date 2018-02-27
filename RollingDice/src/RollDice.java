	import java.security.SecureRandom;

public class RollDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 
		      // randomNumbers object will produce secure random numbers
		      SecureRandom randomNumbers = new SecureRandom();

		      int face1;
		      int face2;
		      int[] totals = new int[13];
		      int rollCount = 36000000;
		      
		      for (int roll = 1; roll <= rollCount ; roll++) 
		      {
		          face1 = 1 + randomNumbers.nextInt(6); // number from 1 to 6
		          face2 = 1 + randomNumbers.nextInt(6);
		          
		          totals[face1+face2]++;
		  
		      } 

		      System.out.printf("Sum\tFreaquency\tPercentage\n");
		      for(int i = 2; i < totals.length; i++) {
		    	  float p = (float)totals[i]*100/(float)rollCount;
		    	  System.out.printf("%d\t%d\t\t%.2f\n", i, totals[i], p);
		     
		   }
		} // end class RollDie
		
		
		
		

	

}
