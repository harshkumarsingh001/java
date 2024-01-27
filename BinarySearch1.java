import java.util.*;

public class BinarySearch1
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of array");
	    int size=sc.nextInt();
	    
	    int []a= new int[size];
	    System.out.println("Enter the element in array");
	    for(int i=0;i<size;i++){
	        a[i]=sc.nextInt();
	    }
	    System.out.println("enter the key which you want to find");
	    int key=sc.nextInt();
	    
	    System.out.println("the key is at index"+" "+BinarySearch(a,key));
	      
	    sc.close();
	}
		
		public static int BinarySearch(int arr[],int key){
		    int start=0,end=arr.length-1;
		    
		    while(start<=end){
		         int mid=(start+end)/2;
		        if(arr[mid]==key){
		            return mid;
		        }
		        if(arr[mid]<key){
		            start=mid+1;
		            
		        }
		        else{
		            end=mid-1;
		        }
		    }
		    return -1;
		}
		
	
	
}
