import java.util.Scanner;
class Main
{
   public static int square(int num)
   {
	 int m=num*num;
     return m;
   }
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int op=square(n);
      System.out.print(op);
	} 
}