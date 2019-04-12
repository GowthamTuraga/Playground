import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner in =new Scanner (System.in);
    int n = in.nextInt();
    int arr[]=new int[n];
    for(int i=0; i<n; i++)
    {
      arr[i]=in.nextInt();
    }
    int non_zero[]=new int[n];
    int nonzero_size=0;
    int zeroes[]=new int[n];
    int zero_size=0;
    for(int i=0; i<n; i++)
    {
       if(arr[i]!=0)
       {
         non_zero[nonzero_size]=arr[i];
         nonzero_size++;
       }
      else
      {
        zeroes[zero_size]=arr[i];
        zero_size++;
      }
    }
    int arr_index=0;
    for(int i=0; i<(nonzero_size); i++)
    {
      arr[arr_index]=non_zero[i];
      arr_index++;
    }
    for(int i=0; i<(zero_size); i++)
    {
      arr[arr_index]=zeroes[i];
      arr_index++;
    }
    for(int i=0; i<n; i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
    
  	}
