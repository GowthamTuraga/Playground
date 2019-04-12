import java.util.Scanner;
import java.util.Arrays;
class Main  
{
  public static void main(String args[])
  {
    //type your code;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    for(int i=0; i<n; i++)
    {
      list[i] = in.nextInt();
    }
    int m = n/2;
    bubble_sort(m,list);
    for(int i=0; i<n; i++)
    {
      System.out.print(list[i]+" ");
    }
  }
  public static void bubble_sort(int m,int list[])
  {
    for(int i=0; i<m; i++)
    {
      for(int j=0; j<=m-2-i; j++)
      {
        if(list[j] > list[j+1])
        {
          int temp = list[j];
          list[j] = list[j+1];
          list[j+1] = temp;
        }
      }
    }
    
}
}