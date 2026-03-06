import java.util.*;
public class ExtractDigits {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int n=sc.nextInt();
        while(n>0){
            int rem=n%10;
            n/=10;
            System.out.println(rem);
        }
       
    }
}

/*
enter the number :
5382
2
8
3
5
*/
