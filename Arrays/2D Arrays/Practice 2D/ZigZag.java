public class ZigZag {
     public static void main(String args[]){
       
    int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};

        for(int i=0;i<arr[0].length;i++){
            if(i%2==0){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j][i]+"  ");
            }
        }else{
             for(int j=arr.length-1;j>=0;j--){
                System.out.print(arr[j][i]+"  ");
            }
        }
            
        }
    }
}

/*
1  5  9  13  17  18  14  10  6  2  3  7  11  15  19  20  16  12  8  4 

*/
