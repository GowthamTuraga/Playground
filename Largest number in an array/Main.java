import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }
        int max_no;
        if(arr[0] > arr[1])
        {
            max_no = arr[0];
        }
        else{
             max_no = arr[1];
        }
        for(int i = 2; i < n; i++)
        {
            if(max_no < arr[i])
            {
                max_no = arr[i];
            }
        }
        System.out.println(max_no);
    }
}