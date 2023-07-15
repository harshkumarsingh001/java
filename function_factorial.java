import java.util.Scanner;
public class function_factorial {
    public static void  printfactorial(int n){
        if(n<=0){
            System.out.println("invalid");
            return;
        }
        int result=1;
        for(int i=n;i>=1;i--){
            result=result*i;}
        System.out.println(result);
        
    }
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();

printfactorial(n);

sc.close();
    }
    
}
