import java.util.Scanner;
class LoanCalculation
{
    public static void main(String[]arg)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println(" LOAN CALCULATOR ");
       System.out.println();
       System.out.println("Enter the amount: ");
       float amount=sc.nextFloat();
       System.out.println("Enter the ROI: ");
       float roi=sc.nextFloat();
       System.out.println("Enter the tenture (months):");
       int month=sc.nextInt();

        //conversion from months to years.

        String str (month/12)+"."+(month%12);
        float con Float.parseFloat(str);
        System.out.println();
         System.out.println(" LOAN CALCULATOR ");
         System.out.println("Principal Amount:"+amount);
         System.out.println("ROI: "+roi+"%");
         System.out.println("Tenture: "+month+ "months");
          float intYear amount roi/100;
            float totalInter intYear con;
         System.out.println("Interest: "+totalInter);
        float outStanding amount+totalinter;
        System.out.println("Total Outstanding Amount: "+(outstanding));
              System.out.println("Emi:"+(outStanding/month)+"rs");

}
}