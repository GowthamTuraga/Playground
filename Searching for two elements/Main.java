import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int arr[]=new int[n];
      int searchele_ind1 = -1;
      int searchele_ind2 = -1;
      for(int i=0; i<n; i++)
      {
         arr[i]=in.nextInt();
      }
      int search_elem1=in.nextInt();
      int search_elem2=in.nextInt();
      for(int i=0; i<n; i++)
      {
        if(search_elem1==arr[i])
        {
           searchele_ind1=i;
        }
      }
      for(int i=0; i<n; i++)
      {
        if(search_elem2==arr[i])
        {
           searchele_ind2=i;
        }
      }
      System.out.println(searchele_ind1);
      System.out.println(searchele_ind2);
    }
}