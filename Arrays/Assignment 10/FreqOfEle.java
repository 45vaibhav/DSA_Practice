import java.util.Scanner;

public class FreqOfEle {
       public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array Element : ");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int max=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        } 
           int freq[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
                freq[arr[i]]++;
            }

            for(int i=0;i<freq.length;i++){
                System.out.println(i+" : "+freq[i] );
            }

    }
}

/*
enter the size of array : 
7
Enter the array Element : 
1 2 2 3 1 4 2
0 : 0
1 : 2
2 : 3
3 : 1
4 : 1
*/
