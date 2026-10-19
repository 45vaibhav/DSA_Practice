
import java.util.Scanner;

public class all {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }

        // Find number-row positions dynamically.
        int[] rows = new int[n];
        int count = 0;

        for (int row = n; row >= 1; row--) {
            if (isNumberRow(row)) {
                rows[count++] = row;
            }
        }

        int number = 15;
        int numberRowIndex = 0;

        for (int i = n; i >= 1; i--) {
            boolean printNumbers = isNumberRow(i);
            int temp = number;

            for (int j = 1; j <= i; j++) {
                if (printNumbers) {
                    System.out.print(temp + " ");
                    temp += 5;
                } else {
                    System.out.print("*  ");
                }
            }

            System.out.println();

            if (printNumbers) {
                number -= 5;
                numberRowIndex++;
            }
        }

        sc.close();
    }

    // Number rows: 9, 5, 2 for n = 14.
    // These are based on triangular-number differences.
    static boolean isNumberRow(int row) {
        int x = row;
        while (x > 0) {
            int triangular = x * (x + 1) / 2;
            if (triangular == row) {
                return true;
            }
            if (triangular > row) {
                break;
            }
            x++;
        }
        return false;
    }
}


