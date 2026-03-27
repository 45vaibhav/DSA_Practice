import java.util.*;
public class FrequencyArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
      

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            
        }
        int[] freq=new int[max+1];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        System.out.println("the frequency of all numbers is : ");
        for(int i=0;i<freq.length;i++){
            System.out.print(freq[i]+"  ");
        }

    }
}


/*
enter the size of array : 
7
3 2 1 3 7 3 1
the frequency of all numbers is : 
0  2  1  3  0  0  0  1
*/
