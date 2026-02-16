
	import java.util.*;
	
	class SquarePattern2{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size : ");
			int n=sc.nextInt();
			for(int i=1;i<=	n;i++){
				for(int j=0;j<n;j++){
					System.out.print(i+" ");
				}
			System.out.println();
			}
		}
	}


/*
Enter the size :
4
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
*/