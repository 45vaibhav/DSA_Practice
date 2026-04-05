import java.util.*;
public class SecondHighestFreqElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter the array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       
        int high=0;
        int secondHigh=0;

        for(int i=0;i<arr.length;i++){
             int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>high){
                secondHigh=high;
                high=count;
            }
        }
        System.out.println(secondHigh);
           
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==secondHigh){
                System.out.println("second max freq element is : "+arr[i]);
                
            }
        }
    }
}

/*
enter the size of array : 
8
enter the array elements : 
1 2 2 3 3 3 4 4 
2
second max freq element is : 2
second max freq element is : 2
second max freq element is : 4
second max freq element is : 4



enter the size of array : 
4
enter the array elements : 
1 2 5 5
1
second max freq element is : 1
second max freq element is : 2s
*/
