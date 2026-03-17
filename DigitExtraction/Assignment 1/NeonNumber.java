import java.util.Scanner;

public class NeonNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        int sum=0;
        int square=n*n;

        while(square!=0){
            int rem=square%10;
            sum+=rem;
            square/=10;
        }

        if(sum==n){
            System.out.println("Neon number ");
        }else{
            System.out.println("not neon number ");
        }
    }
}


/*
enter the number : 
9
Neon number 

enter the number : 
6
not neon number 

enter the number : 
546
not neon number 
*/
