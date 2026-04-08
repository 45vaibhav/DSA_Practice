import java.util.Scanner;

public class p2 {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n : ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+"  ");
            }
            System.err.println();
        }
    }
}


/*
enter the n : 
4
1  2  3  4  
1  2  3  4
1  2  3  4
1  2  3  4


Time complexity : n*n = O(n^2)
Space Complexity: O(1)
*/
