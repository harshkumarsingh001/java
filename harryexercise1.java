import java.util.Scanner;
public class harryexercise1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("marks of student");
        System.out.print("maths:-");
        int sub1=sc.nextInt();
        System.out.print("science:-");
        int sub2=sc.nextInt();
        System.out.print("english:-");
        int sub3=sc.nextInt();
        System.out.print("hindi:-");
        int sub4=sc.nextInt();
        System.out.print("computer:-");
        int sub5=sc.nextInt();
        float percantage=(sub1+sub2+sub3+sub4+sub5)/5;
        System.out.print("percentage :- ");
          System.out.print(percantage);
        sc.close();

    }
    
}
