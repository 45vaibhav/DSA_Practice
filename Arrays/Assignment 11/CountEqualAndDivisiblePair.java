import java.util.Scanner;

public class CountEqualAndDivisiblePair {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of Array : ");
        int n=sc.nextInt();
        System.out.println("enter the k : ");
        int k=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array element : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        
       int count=0;
      for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]==arr[j]&& (i*j)%k==0) ){
                        count++;
                        System.out.println(i+" "+j);
                }  
            }
           
      }
      System.out.println("count : "+count);  
    }
}


/*
7
enter the k : 
2
enter the array element : 
3 1 2 2 2 1 3
0 6
2 3
2 4
3 4
count : 4
*/
