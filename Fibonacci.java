                    /* Fibonacci Series*/
import java.util.Scanner;
class Fibonacci
{
  public static void main(String[] args)
   {
  int n,i,a=0,b=1,c;
  System.out.println("Enter the Number=");
  Scanner S = new Scanner(System.in);
  n = S.nextInt();
  for(i=1; i<=n; i++)
     {
      System.out.print(a+" ");
      c=a+b;
      a=b;
      b=c;
     }
   }
}