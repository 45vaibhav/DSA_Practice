import java.util.Scanner;

public class GCD {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number :");
        int num1=sc.nextInt();
        System.out.println("enter the second number :");
        int num2=sc.nextInt();
        int gcd=1;
        for(int i=1;i<=Math.min(num1,num2);i++){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
        }
        System.out.println("GCD is :"+gcd);
    }
}

/*
enter the first number :
12
enter the second number :
43
GCD is :1


enter the first number :
12
enter the second number :
24
GCD is :12


enter the first number :
34
enter the second number :
78
GCD is :2
*/
