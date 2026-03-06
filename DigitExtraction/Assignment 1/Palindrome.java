import java.util.Scanner;

public class Palindrome {
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
       if(n==sum){
        System.out.println("it is Palindrome ");
       }else{
        System.out.println("it is not Palindrome");
       }
    }
}

/*
enter the number :
121
it is not Palindrome

enter the number :
321
it is not Palindrome
*/
