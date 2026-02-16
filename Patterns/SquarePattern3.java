import java.util.*;
	
	class SquarePattern3{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size : ");
			int n=sc.nextInt();
			for(int i=1;i<=	n;i++){
				for(int j=0;j<n;j++){
					System.out.print(" ("+i+","+j+")");
				}
			System.out.println();
			}
		}
	}


/*
Enter the size :
4
 (1,0) (1,1) (1,2) (1,3)
 (2,0) (2,1) (2,2) (2,3)
 (3,0) (3,1) (3,2) (3,3)
 (4,0) (4,1) (4,2) (4,3)
*/