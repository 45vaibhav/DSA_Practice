import java.util.Scanner;

public class SquarePattern8 {
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size :");
			int n=sc.nextInt();
            int count=1;
			for(int i=1;i<=n;i++){
				for(int j=1;j<=n;j++){
					if(i>=j){
					System.out.print(count+" ");
                    count+=2;
				}else{
					System.out.print("  ");
				}
			}
		System.out.println();
		}
	}
}

/*
Enter the size :
4
1
3 5
7 9 11
13 15 17 19  
*/


// only odd numbers print in pattern