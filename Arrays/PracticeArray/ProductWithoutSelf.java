import java.util.Arrays;
import java.util.Scanner;

public class ProductWithoutSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Arrays size : ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
//kdjskf
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    product *= nums[j];
                }
            }
            arr[i] = product;
        }

        System.out.println("Answer is : " + Arrays.toString(arr));
        
    }
}

/*
Enter the Arrays size : 
4
Enter the array elements : 
1 2 3 4
Answer is : [24, 12, 8, 6]
*/
