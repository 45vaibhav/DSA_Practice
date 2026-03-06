import java.util.*;

public class CountNumberOfDivisors {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            
            if(n%i==0){
                count+=2;
            }
        }
        System.out.println("the all divisors are : "+count);
    }
}
