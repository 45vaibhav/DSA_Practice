import java.util.Scanner;

public class FindSecLargestAndSecSma {
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
        int secondlarge=0;
        int min=Integer.MAX_VALUE;
        int secSmall=min;


        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondlarge=max;
                max=arr[i];
            }

            if(arr[i]<min){
                secSmall=min;
                min=arr[i];
            }
        }
        System.out.println("sec large : "+secondlarge);
        System.out.println("sec small : "+secSmall);


    }
}

/*
enter the size of array : 
5
Enter the array Element : 
5 2 8 1 9
sec large : 8
sec small : 2


enter the size of array : 
6
Enter the array Element : 
3 44 5 66 9 1 09
sec large : 44
sec small : 3
*/
