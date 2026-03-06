import java.util.*;
public class CountOfDigits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            int rem=n%10;
            n/=10;
            count++;
        }
        System.out.println("num of digits are : "+count);
    }
}

/*
enter the number :
54321
num of digits are : 5
*/
