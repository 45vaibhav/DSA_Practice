//Basic Square pattern
	import java.util.*;

	class SquarePattern{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the size of the square :");
			int n=sc.nextInt();
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}

/*
enter the size of the square :
5
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
	
*/