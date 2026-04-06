import java.util.Scanner;

public class SecondLeastFrequentElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter the array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
      
       
        int least=arr.length;
        int secondLeast=0;

        for(int i=0;i<arr.length;i++){
             int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count<least){
                secondLeast=least;
                least=count;
            }

            if(count<secondLeast && count >least){
                secondLeast=count;
            }
        }
        System.out.println(secondLeast);
           
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==secondLeast){
                System.out.println("second max freq element is : "+arr[i]);
               
            }
        }
    }
}

/*
enter the size of array : 
6
enter the array elements : 
1 1 2 2 2 3 
2
second max freq element is : 1
second max freq element is : 1



enter the size of array : 
6
enter the array elements : 
1 2 2 3 3 3
2
second max freq element is : 2
second max freq element is : 2
*/
