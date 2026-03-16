import java.util.Scanner;

public class p1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number  :");
        int n=sc.nextInt();

        fun(n);

    }

    static void fun(int n){
        if(n==0){
            System.out.println("500");
        }
        System.out.println("100");
        fun(n-2);
        System.out.println("200");
        // fun(n-1);
        // System.out.println("300");
    }
}
