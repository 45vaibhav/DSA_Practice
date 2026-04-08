import java.util.Scanner;

public class p5 {
             public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n : ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j==n+1 || i==j ){
                    System.out.print(i+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.err.println();
        }
    }
}


/*
enter the n : 
5
1       1 
  2   2
    3
  4   4
5       5


Time complexity : n*n = O(n^2)
Space Complexity: O(1)
*/


