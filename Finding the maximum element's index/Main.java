import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in =new Scanner(System.in);
    int n = in.nextInt();
    int list[]= new int[n];
    int index=0;
    for( int i=0; i<n; i++)
    {
       list[i]= in.nextInt();
    }
    int large=list[0];
    for(int i=1; i<n; i++)
    {
       if(list[i] > large)
       {
          large=list[i];
          index=i;
       }
    }
    System.out.print(index);

 
  }
}