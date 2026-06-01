import java.util.ArrayList;
import java.util.Scanner;

public class SubArraySum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Arrray : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int k=6;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            ArrayList<Integer>ls=new ArrayList<>();


            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                ls.add(arr[j]);
                if(sum==k){
                    System.out.println(ls);
                }
            }
        }
        

    }
}

/*
Enter the size of Arrray : 
5
Enter the array elements : 
3 1 2 4 6
[3, 1, 2]
[2, 4]
[6]
*/
