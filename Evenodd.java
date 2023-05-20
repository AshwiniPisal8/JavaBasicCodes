/* Odd And Even Program using Scanner Class */

import  java.util.Scanner;
class Evenodd
{
  public static void main(String args[])
   {
     int n;
     Scanner s = new Scanner(System.in);
     System.out.print("Enter Any No=");
     n = s.nextInt();

     if(n%2==0)
      {
       System.out.println("Even Number");
       }
     else
      {
       System.out.println("Odd Number");
       }
   }
}