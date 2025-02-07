import java.util.Scanner;
class CurrencyConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("   CURRECY CONVERTER    ");
		System.out.println();
		System.out.println("Enter the Ammount(INR)   :");
		float inr = sc.nextFloat();
		System.out.println();

		System.out.println("LIST OF CURRENCY");
		System.out.println("1.USD");
		System.out.println("2.EUR");
		System.out.println("3.GBP");
		System.out.println("4.PKR");
		System.out.println("5.JAP");
		System.out.println("6.EGYPT");

		System.out.println("Enter Currency  :");
		String curr = sc.next().toUpperCase();

		float conCurr = 0;
		if(curr.equals("USD"))
		{
			conCurr = inr/86.54f;
			System.out.println(inr + " INR = " +conCurr+ "  USD ");
		}
		else if(curr.equals("EUR"))
		{
			conCurr = inr/90.28f;
			System.out.println(inr + " INR = " +conCurr+ "  EUR  ");
		}
		else if(curr.equals("GBP"))
		{
			conCurr = inr/107.83f;
			System.out.println(inr + " INR = " +conCurr+ "  GBP  ");
		}
		else if(curr.equals("PKR"))
		{
			conCurr = inr/0.31f;
			System.out.println(inr + " INR = " +conCurr+ "  PKR  ");
		}
		else if(curr.equals("JAP"))
		{
			conCurr = inr/0.56f;
			System.out.println(inr + " INR = " +conCurr+ "  JAP  ");
		}
		else if(curr.equals("EGYPT"))
		{
			conCurr = inr/1.72f;
			System.out.println(inr + " INR = " +conCurr+ "  EGYPT  ");
		}
		else 
		{
			System.out.println("INVALID INPUT");
		}

						

	}
}
