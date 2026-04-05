import java.util.Arrays;
import java.util.Scanner;

public class GroupNumByFrequency {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter the array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       int index1=0;
       int index2=0;
        int freq1[]=new int[arr.length];
        int freq2[]=new int[arr.length];


        for(int i=0;i<arr.length;i++){
             int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                freq1[index1]=arr[i];
                index1++;
            }
            if(count==2){
               
                freq2[index2]=arr[i];
                index2++;
            }
        }
        System.out.println(Arrays.toString(freq1));
         System.out.println(Arrays.toString(freq2));
    }
}


/*
enter the size of array : 
5
enter the array elements : 
1 1 2 3 3
[2, 0, 0, 0, 0]
[1, 1, 3, 3, 0]

enter the size of array : 
7
enter the array elements : 
1 1  2 2 3 3 6
[6, 0, 0, 0, 0, 0, 0]
[1, 1, 2, 2, 3, 3, 0]
*/
