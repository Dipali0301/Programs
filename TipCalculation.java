import java.util.Scanner;
class TipCalculation
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the bill :");
		float bill = sc.nextFloat();
		
		System.out.println("Tip rate :");
		float tipRate = sc.nextFloat();

		float tipAmount = (tipRate*bill)/100;
		float totalBill = bill*tipAmount;

		System.out.println("totalBill is :" +totalBill);
		System.out.println("tip added is :" +tipAmount);

	}
}
