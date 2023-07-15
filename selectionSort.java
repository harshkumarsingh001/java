public class selectionSort {
    public static void main(String[]args){
        int[]ages={14,12,15,24,11};

        for(int i=0;i<ages.length-1;i++){
           int smallest=i;
           for(int j=i+1;j<ages.length;j++){
            if(ages[j]<ages[smallest]){
                smallest=j;
            }

           }

        
        int temp=ages[smallest];
            ages [smallest]=ages[i];
        ages[i]=temp;
    }
   for(int i=0;i<ages.length;i++){
    System.out.println(ages[i]);
   }
    }
    
}
