import java.util.Scanner;

public class p10 {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n : ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"  ");
            }

            for(int j=1;j<=2*(n-i);j++){
                System.out.print("   ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j+"  ");
            }
            System.err.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+"  ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("   ");
            }
              for(int j=i;j>=1;j--){
                System.out.print(j+"  ");
            }

            System.out.println();
        }
    }
}

/*
enter the n : 
4
1                    1  
1  2              2  1
1  2  3        3  2  1
1  2  3  4  4  3  2  1
1  2  3  4  4  3  2  1
1  2  3        3  2  1
1  2              2  1
1                    1


Time complexity : n*n + 2*n*n +n*n + 2*n*n +n*n= 8n^2=O(n^2)
Space Complexity : O(1)
*/

