import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfStringElements {
    public static void main(String arsg[]){
        String s="apple";

        HashMap <Character, Integer >hm=new HashMap<>();

        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        }


        for(Map.Entry<Character , Integer >entry : hm.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }
}

/*
p  2
a  1
e  1
l  1
*/
