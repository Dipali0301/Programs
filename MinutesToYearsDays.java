import java.util.Scanner;

class MinutesToYearsDays 
	{
    public static void main(String[] args) 
		{
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of minutes
        System.out.print("Enter the number of minutes: ");
        long minutes = sc.nextLong();

        // Calculate the number of years and remaining days
        long minutesInYear = 365 * 24 * 60; // Total minutes in a year
        long years = minutes / minutesInYear; // Calculate the number of years
        long remainingMinutes = minutes % minutesInYear; // Remaining minutes
        long days = remainingMinutes / (24 * 60); // Convert remaining minutes to days

        // Display the result
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

        
    }
}
