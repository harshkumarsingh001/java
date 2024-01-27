
        import java.util.*;
        public class LinearSearch
        {
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                
                System.out.print("enter the size of array:-");
                int size=sc.nextInt();
                
                int a[]=new int[size];
                
            
                for(int i=0;i<size;i++){ 
                    a[i]=sc.nextInt();
                }
                    System.out.println("enter");
                        int index=sc.nextInt();
                int flag=0;
                
                for(int i=0;i<size;i++){
        
                if(a[i]==index){
                flag=1;
              
               System.out.println("index found at:-"+i); 
               break;          
            }
                 
                }
                if(flag==1){
                    System.out.println("index found");
                }
                else{
                    System.out.println("not found");
                }
                sc.close();
                }
                }
        
        
         
    

