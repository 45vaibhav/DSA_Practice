import java.util.Scanner;

public class p6 {
    
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number ");
        int n=sc.nextInt();

        fun(n);
    }

   static  void fun(int n){
            if(n<=1){
                System.out.print(n+" ");
                return ;
            }

            System.out.print(n+" ");

            fun(n/2);

            System.out.print(n+" ");

            
    }
}

/*
enter the number 
8
8 4 2 1 2 4 8 
*/
