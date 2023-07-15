import java.util.Scanner;
public class function {
    public static int calculateProduct(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String[]args){
       Scanner sc= new Scanner(System.in);
       int a=sc.nextInt();
        int b=sc.nextInt();

        int multiply=calculateProduct(a,b);
        System.out.println(multiply);

        sc.close();
    }
}
