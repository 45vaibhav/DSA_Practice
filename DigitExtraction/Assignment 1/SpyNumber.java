import java.util.Scanner;

public class SpyNumber {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        int sum=0;
       int fact=1;
       int copy=n;

       while(n!=0){
        int rem=n%10;
        sum+=rem;
        n/=10;
       }
       while(copy!=0){
        int rem=copy%10;
        fact*=rem;
        copy/=10;

       }

       if(sum==fact){
        System.out.println("Spy number ");
       }else{
        System.out.println("not Spy number ");
       }

    }
}


/*
Enter the number : 
1124
Spy number 

Enter the number : 
4231
not Spy number
*/
