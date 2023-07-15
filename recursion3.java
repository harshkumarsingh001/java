import java.util.Scanner;

public class recursion3 {
    public static int calcFactorial(int n){
        if(n==0){
            return 1;
        }
      
        

        int fact=calcFactorial(n-1);
       int factorial=fact*n;
        return factorial;

    }
    public static void main(String[]args){
        System.out.print("enter the number:-");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        int ans=calcFactorial(n);
        System.out.println("the factorial of:-" + n + "   is :-  " + ans);
        sc.close();

    }
    
}
