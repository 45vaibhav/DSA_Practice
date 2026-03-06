import java.util.Scanner;

public class ReverseNumber {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int rem=n%10;
            n/=10;
           sum=sum*10+rem;
        }
       System.out.println(sum);
    }
}

/*
enter the number :
12345
54321
*/
