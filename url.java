import java.util.Scanner;
public class url {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         System.out.print("write the URL:-");
        String URL=sc.nextLine();
        System.out.println(URL);
    
    if(URL.endsWith(".com")){
       System.out.println("commercial website");}
    
    else if(URL.endsWith(".org")){
       System.out.println("organization website");   }

    else if(URL.endsWith(".in")){
       System.out.println("indian website"); }  
    else{
        System.out.println("error");
    }
   sc.close();
    }
    
}
