import java.util.Scanner;

public class p9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n : ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }

            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.err.println();
        }
    }
}

/*
enter the n : 
5
        1 
      1 2
    1 2 3
  1 2 3 4
1 2 3 4 5


Time complexity : n*n + n*n = 2n^2=O(n^2)
Space Complexity : O(1)
*/
