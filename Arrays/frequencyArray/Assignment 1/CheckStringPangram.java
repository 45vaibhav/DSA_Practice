import java.util.Scanner;

public class CheckStringPangram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string : ");
        String s=sc.nextLine();

        int freq[]=new int[(int)'z'-'a'+1];
         
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
            boolean ans=true;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==0){
               ans=false;
               
               break;
            }
        }
        System.out.println(ans); 
        
    }
}

/*
enter the string : 
thequickbrownfoxjumpsoverthelazydog
true
*/
