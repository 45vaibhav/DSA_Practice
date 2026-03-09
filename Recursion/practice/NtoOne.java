import java.util.Scanner;

public class NtoOne {
     public static void main(String atrhs[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();
         fun(n);
    }
    static void fun(int n){
        if(n<1){
            return ;
        }
       
        System.out.print(n+" ");
        fun(n-1);
      
       
    }
}

/*
enter the number : 
5
5 4 3 2 1 
*/
