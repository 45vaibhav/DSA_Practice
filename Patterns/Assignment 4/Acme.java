public class Acme {
    public static void main(String args[]){
        int n=13;
        int value=2;
        int number=10;

        for(int i=1;i<=n;i++){
            int temp=number;
            for(int j=1;j<=i;j++){
            if(i==value){
                System.out.print(temp+" ");
                if(i==j){
                    value=(value+1)+i;
                    number+=10;
                }
                temp+=10;
            }else{
                System.out.print("*  ");
            }
        }
        System.out.println();
        
        }
    }
}

/*
*  
10 20 
*  *  *  
*  *  *  *  
20 30 40 50 60 
*  *  *  *  *  *  
*  *  *  *  *  *  *  
*  *  *  *  *  *  *  *  
*  *  *  *  *  *  *  *  *  
*  *  *  *  *  *  *  *  *  *  
30 40 50 60 70 80 90 100 110 120 130 
*  *  *  *  *  *  *  *  *  *  *  *  
*  *  *  *  *  *  *  *  *  *  *  *  *  
*/