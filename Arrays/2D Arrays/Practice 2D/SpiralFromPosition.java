import java.util.ArrayList;

public class SpiralFromPosition {
    public static void main(String args[]){
       
    int arr[][]={{31,25,18,9,8,7},{24,21,15,6,1,2},{28,23,14,5,4,3},{27,22,13,12,11,10},{26,20,19,17,16,30}};

      int total=arr.length*arr[0].length;
      int fr=1;
      int lr=1;
      int fc=4;
      int lc=fc+1;
        int dir=0;

        ArrayList<Integer>ls=new ArrayList<>();
      while(total!=0){
         
         
            for(int i=fc;i<=lc;i++){
                ls.add(arr[fr][i]);
                total--;
            }
            lr++;
        
            for(int i=fr;i<=lr;i++){
                ls.add(arr[i][lc]);
                total--;
            }
            fc--;
         
        
            for(int i=lc;i>=fc;i--){
                ls.add(arr[lr][i]);
                total--;
            }
            fr--;

         
         
            for(int i=lr;i>=fr;i--){
                ls.add(arr[i][fc]);
                total--;
            }
            lc++;
         
         

      }

      System.out.println(ls);
    }
}
