import java.util.Scanner;

public class PerfectNumber {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        int sum=1;
        for(int i=1;i<=Math.sqrt(n);i++){
            int quotient=n/i;
            if(n%i==0 && quotient<n){
                sum+=i+quotient;
            }
        }
        System.out.println(sum);
        if(sum==n){
            System.out.println("perfect ");
        }else{
            System.out.println("not perfect ");
        }
    }
}
