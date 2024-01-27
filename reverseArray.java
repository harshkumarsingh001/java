
public class reverseArray
{
    public static void reverse(int array[]){
        int frist=0,last=array.length-1;
        
        while(frist<last){
            int temp=array [last];
           array [last]=array [frist];
           array[frist]=temp;
           
           frist++;
           last--;
        }
       
    }
    
    
    	public static void main(String[] args) {
		int arr[]={12,3,45,4};
	   reverse(arr);
	   for(int i=0;i<arr.length;i++){
	       System.out.print(arr[i]+" ");
	   }
	 System.out.println();
	    
	}
}
