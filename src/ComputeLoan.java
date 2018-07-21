import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;
 //simple App for compute Loan in given number of years and interest rate
public class ComputeLoan {

public static void main (String [] args)

{
     Scanner scanner = new Scanner(System.in);
     System.out.println("enter loan amount, e.g.,120000.95: ");
     double loanamount = scanner.nextDouble();
     System.out.println("enter number of years as Integer");
     int numofyears= scanner.nextInt();
     System.out.println("enter interest rate");
     double annualinterest= scanner.nextDouble();
     double monhtlyinterset= annualinterest/1200;
     double p=numofyears * 12 ;
     double m= 1+monhtlyinterset;
     double monthpayment=loanamount*monhtlyinterset/(1-1/Math.pow(m,p));
     double totalpayment=monthpayment*numofyears*12;
         // here the display messages
     System.out.println("the monthly payment is $"+(int)(monthpayment *100) / 100.0);
     System.out.println("the total payment is $"+(int)(totalpayment*100)/100.0);
        // calc Bast
      System.out.println("enter b");
      int b = scanner.nextInt();
      System.out.println("enter a");
      int a = scanner.nextInt();
      System.out.println("enter c");
     int c = scanner.nextInt();
      int undergazer=(b*b)- 4 * a * c ;
     double x = Math.sqrt(undergazer);
     double bast = -1 * b + x ;
     double makam = 2* a ;
     double result = bast / makam;
     System.out.println("result is "+result);



}

}
