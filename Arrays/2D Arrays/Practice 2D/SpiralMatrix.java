import java.util.ArrayList;

public class SpiralMatrix {
      public static void main(String args[]){
       
    int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

      int total=arr.length*arr[0].length;
      int fr=0;
      int lr=arr.length-1;
      int fc=0;
      int lc=arr[0].length-1;
        int dir=0;

        ArrayList<Integer>ls=new ArrayList<>();
      while(total!=0){
         
         
            for(int i=fc;i<=lc;i++){
                ls.add(arr[fr][i]);
                total--;
            }
            fr++;
        
            for(int i=fr;i<=lr;i++){
                ls.add(arr[i][lc]);
                total--;
            }
            lc--;
         
        
            for(int i=lc;i>=fc;i--){
                ls.add(arr[lr][i]);
                total--;
            }
            lr--;

         
         
            for(int i=lr;i>=fr;i--){
                ls.add(arr[i][fc]);
                total--;
            }
            fc++;
         
         

      }

      System.out.println(ls);
    }
}

/*
piralMatrix }
[1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
*/
