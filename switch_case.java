import java.util.Scanner;
public class switch_case {
    public static void main(String[]args){
        System.out.print("enter the number(1-7):-");
    Scanner sc=new Scanner(System.in);
    int day=sc.nextInt();
        switch(day){
case 1:
        System.out.println("SUNDAY");
             break;
case 2:
        System.out.println("MONDAY");
         break;
case 3:
        System.out.println("TUESDAY");
         break;
case 4:
        System.out.println("WEDNESDAY");
         break;
case 5:
System.out.println("THRUSDAY") ;
 break;
case 6:
        System.out.println("FRIDAY");
         break;
case 7:
        System.out.println("SATURDAY");
         break;
default:
        System.out.println("out of range");
         break;
        }
    sc.close();
        
    }
}
          






