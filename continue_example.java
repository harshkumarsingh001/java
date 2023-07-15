public class continue_example{
    public static void main(String[]args){
       int i=1;
while(i<15){
  
    if(i==5){
        System.out.println("loop end");
        i++;
        continue;
        
    }
    System.out.println(i+  "-:good morning");
    i++;
}

    }
}