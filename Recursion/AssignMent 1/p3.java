import java.util.Scanner;

public class p3 {
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
                fun(n-2);
            System.out.print(n+" ");

            fun(n-2);

 
    }
}


/*
enter the number 
4
0 2 0 4 0 2 0 
*/
