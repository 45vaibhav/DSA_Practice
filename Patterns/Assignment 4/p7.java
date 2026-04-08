import java.util.Scanner;

public class p7 {
    
       public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n : ");
        int n=sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*  ");
            }
            System.err.println();
        }
    }
}

/*
enter the n : 
5
*  *  *  *  *  
*  *  *  *
*  *  *
*  *
*



Time Complexity : n*n = O(n^2)
Space Complexity : O(1)
*/

