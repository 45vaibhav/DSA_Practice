public class Acme2 {
    public static void main(String args[]){
        int n=14;
        int number=15;
        int value=0;
        int q=0; 
        int p=2;
            
       for(int i=1;value<=n;i++){
        value=(value)+q;
             q++;
             p+=(i+2);
            
       }
       
        
        value=value-q;
        q=q-2;
        System.out.println(value);
        System.out.println(q);
        int check=value;
        for(int i=n;i>=1;i--){
            int temp=number;
            for(int j=1;j<=i;j++){
                if(check==i){
                    System.out.print(temp+" ");
                   temp+=5;
                    if(i==j){
                       check=i-q;
                       q--;
                        number-=5;
                    }
                }else{
                    System.out.print("*  ");
                }
            } 
            System.out.println();   
        }
    }
}
/*
18
*  *  *  *  *  *  *  *  *  *  *  *  *  
*  *  *  *  *  *  *  *  *  *  *  *  
*  *  *  *  *  *  *  *  *  *  *  
*  *  *  *  *  *  *  *  *  *  
15 20 25 30 35 40 45 50 55 
*  *  *  *  *  *  *  *  
*  *  *  *  *  *  *  
*  *  *  *  *  *  
10 15 20 25 30 
*  *  *  *  
*  *  *  
5 10 
*  
*/
