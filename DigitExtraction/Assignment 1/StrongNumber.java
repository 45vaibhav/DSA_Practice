import java.util.Scanner;

public class StrongNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        int sum=0;
        int original=n;
        while(n!=0){
            int rem=n%10;
               int total=1;
           for(int i=rem;i>=1;i--){
            total*=i;
           }
           sum+=total;
           n/=10;
        }
     
        if(original==sum){
            System.out.println("Strong number :");
        }else{
            System.out.println("not Strong number ");
        }
    }
}


/*
Enter the number : 
145
Strong number :


Enter the number : 
134
not Strong number 
*/
