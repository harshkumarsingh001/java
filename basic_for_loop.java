import java.util.Scanner;
public class basic_for_loop{
    public static void main(String[]args){
        System.out.print("enter the number:-");
       Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();
       for(int i=0;i<=n;i++){
       System.out.println(2*i+1);}
       sc.close();

    }
}