import java.util.HashMap;
import java.util.Map;

public class FindDistictElement {
    public static void main(String args[]){
        int arr[]={1 , 2 ,1,3,2,1};

        HashMap<Integer , Integer >hm=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }


        for(Map.Entry<Integer , Integer >entry:hm.entrySet()){

            if(entry.getValue()==1){
                System.out.println("distinct element : "+entry.getKey());
            }
        }
    }
}

/*
distinct element : 3
*/
