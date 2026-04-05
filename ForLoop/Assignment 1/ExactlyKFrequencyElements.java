import java.util.Scanner;

public class ExactlyKFrequencyElements {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter the array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter k : ");
        int k=sc.nextInt();
        int ifNo=0;
        for(int i=0;i<arr.length;i++){
             int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==k){
                System.out.println("elements that frequency equal to k is : "+arr[i]);
              ifNo=count;  
            }
        }
        if(ifNo!=k){
            System.out.println("no elements frequency equal to k ");
        }
}
}

/*
enter the size of array : 
6
enter the array elements : 
1 1 2 2 2 3
enter k : 
2
elements that frequency equal to k is : 1
elements that frequency equal to k is : 1

enter the size of array : 
5
enter the array elements : 
1 2 2 2 3
enter k : 
3
elements that frequency equal to k is : 2
elements that frequency equal to k is : 2
elements that frequency equal to k is : 2
*/
