import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[]= new int[n];
      for(int i=0; i<n; i++)
      {
        arr[i] = in.nextInt();
      }
      int k = in.nextInt();
      int min;
      for(int i=0; i<n; i++)
      {
        for(int j=i+1; j<n; j++)
        {
          if(arr[i]<arr[j])
          {
            min = arr[i];
            arr[i] = arr[j];
            arr[j] = min;
          }
        }
      }
      System.out.print(arr[k-1]);
    }
}
          
    