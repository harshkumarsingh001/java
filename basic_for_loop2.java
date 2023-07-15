import java.util.Scanner;
public class basic_for_loop2{
    public static void main(String[]args){
        System.out.print("enter the number:-");
       Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();
       for(int i=n;i>0;i--){
        System.out.println(i);
       }
    sc.close();
    }
}