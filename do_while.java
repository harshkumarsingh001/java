import java.util.Scanner;
public class do_while {
    public static void main(String[]args){
        System.out.print("enter the last number:-");
         Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=0;
        do{
            System.out.println(b);
         b++;  
        }
        while(b<=a);
        
           sc.close();

        
            
        
    }
    
}
