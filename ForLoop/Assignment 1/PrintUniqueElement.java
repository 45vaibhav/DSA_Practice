import java.util.Scanner;

public class PrintUniqueElement {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter the array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       
        

        for(int i=0;i<arr.length;i++){
             int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println("the unique element : "+arr[i]);
            }
        }
}
}

/*
enter the size of array : 
5
enter the array elements : 
1 1 2 2 3
the unique element : 3
*/
