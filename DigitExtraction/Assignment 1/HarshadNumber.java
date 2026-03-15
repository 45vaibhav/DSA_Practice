import java.util.*;
public class HarshadNumber {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        int sum=0;
        int original=n;
       while(n!=0){
                int rem=n%10;
                sum=sum+rem;
                n=n/10;
       }
       
        if(original%sum==0){
            System.out.println("Harshad number ");
        }else{
            System.out.println("not harshad number ");
        }
    }
}

/*
enter the number : 
18
Harshad number

enter the number : 
16
not harshad number 

enter the number : 
34
not harshad number
*/
