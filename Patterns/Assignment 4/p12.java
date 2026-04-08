import java.util.Scanner;

public class p12 {
         public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n : ");
        int n=sc.nextInt();
            int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1 ; j<=i;j++){
                System.out.print(count+"  ");
                count++;
            }
            System.out.println();
        }


        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){ 
                System.out.print("  ");
            }
            for(int j=1 ; j<=i;j++){
                System.out.print(count+"  ");
                count++;
            }
            System.out.println();
        }
    }
}


/*
enter the n : 
4
      1  
    2  3
  4  5  6
7  8  9  10
  11  12  13
    14  15
      16


Time complexity : n*n +n*n + n*n + n*n = O(n^2)
Space Complexity: O(1)
*/

