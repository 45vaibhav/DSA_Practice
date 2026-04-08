import java.util.Scanner;

public class p1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n : ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*  ");
            }
            System.err.println();
        }
    }
}

/*
enter the n : 
4
*  *  *  *  
*  *  *  *  
*  *  *  *  
*  *  *  * 



Time Complexity : n*n = O(n^2)
Space Complexity : O(1)
*/
