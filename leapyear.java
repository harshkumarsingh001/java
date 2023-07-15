import java.util.Scanner;
public class leapyear {
   public static void main(String[]args){
    System.out.print("ENTER THE YEAR:-");
    Scanner sc=new Scanner(System.in);
    int year=sc.nextInt();
    System.out.println(year);

    if(year%4==0 &&(year%100!=0 ||year%400==0 )){
        System.out.println(year+":-leap year");
    }
    else{
        System.out.println(year+":-not a leap yaer");
   sc.close(); 
}
   }
    
}
