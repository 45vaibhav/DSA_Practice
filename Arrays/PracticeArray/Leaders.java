import java.util.ArrayList;
import java.util.Scanner;

public class Leaders {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Arrray : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int max=Integer.MIN_VALUE;
        ArrayList<Integer>ls=new ArrayList<>();

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                ls.add(max);
            }
        }

        for(int i=ls.size()-1;i>=0;i--){
            System.out.print(ls.get(i)+"  ");
        }
        
    }
}

/*
Enter the size of Arrray : 
8
Enter the array elements : 
7 3 10 4 2 8 1 0
10  8  1  0 
*/
