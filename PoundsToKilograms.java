import java.util.Scanner;
class PoundsToKilograms
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);		
	    
		System.out.println("Enter the weight in pounds: ");
		double pounds = sc.nextDouble();

		// Conversion factor: 1 pound = 0.454 kilograms
        double kilograms = pounds * 0.454;
        
        // Display the result
        System.out.printf("pounds is equal to:   " +kilograms);
        
       

	
	}
}
