import java.util.Scanner;
class BodyMassIndex
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);		
	    
		System.out.println("Enter the weight in pounds: ");
		double pounds = sc.nextDouble();

		System.out.println("Enter the height in inches: ");
		double inches = sc.nextDouble();


        // conversion for kg
		double weight = pounds*0.45359237;


		//conversion for height

		double height = inches*0.0254;


		double bmi = weight/(height*height);

		System.out.println("BMI is  :" +bmi);



	
	}
}
