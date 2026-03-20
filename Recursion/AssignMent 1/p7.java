import java.util.Scanner;

public class p7 {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number ");
        int n=sc.nextInt();

        fun(n);
    }

   static  void fun(int n){
            if(n<=0){
                
                return ;
            }

            System.out.print("A"+n+" ");

            fun(n-1);

            System.out.print("B"+(n*2)+" ");

            
    }
}


/*
enter the number
3
A3 A2 A1 B2 B4 B6 
*/
