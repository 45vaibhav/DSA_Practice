import java.util.*;
public class OnetoN {
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
       
       
        fun(n-1);
    
         System.out.print(n+" ");
    }
}


/*
enter the number : 
5
1 2 3 4 5 
*/
