import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
    Scanner in = new Scanner(System.in);
    int rem,t,sum=0;
    int n=in.nextInt();
    t=n;
    while(n!=0)
       {
          rem=n%10;
          sum=sum+(rem*rem*rem);
          n=n/10;
       }
    if(sum==t)
       System.out.println("Armstrong Number");
    else
       System.out.println("Not a Armstrong Number");
    }
}
   