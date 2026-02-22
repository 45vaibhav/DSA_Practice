import java.util.*;

class SquarePattern4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size :");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++){
				for(int j=1;j<=n;j++){
					int sum=i+j;
					if(sum%2==0){
					System.out.print("* ");
				}else{
					System.out.print("# ");
				}
			}
		System.out.println();
		}
	}
}


/*
Enter the size :
4
* # * #
# * # *
* # * #
# * # *
*/