import java.util.*;
public class doubleNumberPyramid {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size :");
    int n=sc.nextInt();
        for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=(1*i);k++){
                    System.out.print(k+" ");
                }
                System.out.println();
        }
    
   for(int i=1;i<=n-1;i++){
    for(int j=1;j<=i;j++){
        System.out.print(" ");
    }
    for(int k=1;k<=(n-i);k++){
        System.out.print(k+" ");
    }
    System.out.println();
   }
}
}

/*
Enter the size :
4
   1 
  1 2
 1 2 3
1 2 3 4
 1 2 3
  1 2
   1
*/
