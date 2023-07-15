import java.util.Scanner;
public class if_else {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("maths:-");
        int math=sc.nextInt();
        System.out.println(math);
        System.out.print("science:-");
        int science=sc.nextInt();
       System.out.println(science);
        System.out.print("english:-");
        int english=sc.nextInt();
     System.out.println(english);

     int percentage=(math+science+english)/3;
          System.out.print("percentage:-");

          System.out.println(percentage+"%");

          if(percentage>=40 && math>=33 && science>=33 && english>=33){
          System.out.println("pass");
          }else {
             

            System.out.println("fail");

            sc.close();
        }
          

     
    }
    
}
