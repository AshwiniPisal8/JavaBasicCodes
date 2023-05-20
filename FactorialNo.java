/* find Factorial od a Number */
import java.util.Scanner;
class FactorialNo
{
 public static void main(String args[])
   {
    int n,i,fact=1;
    System.out.println("Enter the No=");
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
     
   for(i=1; i<=n; i++)
    {
      fact = fact * i;
    }
   System.out.println("Factorial "+fact);
   }
}
