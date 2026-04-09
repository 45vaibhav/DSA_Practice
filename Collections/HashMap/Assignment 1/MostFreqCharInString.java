import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFreqCharInString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string : ");
        String s=sc.nextLine();

        HashMap<Character,Integer>hm=new HashMap<>();

        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        }

        int max=0;
        char freqChar='a';
        for(Map.Entry<Character,Integer>entry: hm.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                freqChar=entry.getKey();
            }
        }

        System.out.println("the most frequent char is : "+freqChar);
    }
}

/*
enter the string : 
apple
the most frequent char is : p

*/
