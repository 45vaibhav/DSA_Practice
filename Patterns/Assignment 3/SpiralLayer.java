import java.util.*;
// in Spiral Layer we want to consider the position of element and and layer of element
public class SpiralLayer {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
           
            for(int i=1;i<=(2*n)-1;i++){
                for(int j=1;j<=(2*n)-1;j++){
                     int top=i-1;
                     int left=j-1;
                     int bottom=(2*n-2)-top;
                     int right=(2*n-2)-left;
                 int layer= Math.min(Math.min(top,bottom ), Math.min(left, right));
                        System.out.print(n-layer+" ");
                }
                
                System.out.println();
            }

       
    }
}

/*
Enter the size:
3
3 3 3 3 3
3 2 2 2 3
3 2 1 2 3
3 2 2 2 3
3 3 3 3 3
*/
