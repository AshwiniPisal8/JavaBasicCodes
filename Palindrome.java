/* Palindrome Number Program*/

import java.util.Scanner;
class Palindrome
{
 public static void main(String args[])
  {
   
   int n, s=0,c,r; 
   System.out.print("Enter any number = ");
   Scanner S = new Scanner(System.in);
   n = S.nextInt();
   c = n;
   while(n>0)
    {
     r=n%10;
     s=(s*10)+r;
     n=n/10;
    }
   if(c==s)
    {
     System.out.print("Number is Palindrome");
    }
   else
    {
      System.out.print("Number is Not Palindrome");
    }

  }

}