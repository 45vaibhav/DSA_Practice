import java.util.*;
public class Product {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int n=sc.nextInt();
        int product=fun(n);
        System.out.println("product is : "+product);
    }

    static int fun(int n){
        if(n==1){
            return 1;
        }

        int val=fun(n-1);
        return val*n;
    }
}


/*
enter the number :
3
product is : 6


enter the number :
5
product is : 120
*/