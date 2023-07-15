import java.util.Scanner;
public class if_else_practice {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
           System.out.println("income in LAKHS");
        System.out.print("enter income:-");
        double income=sc.nextDouble();
        System.out.println(income+"L");
        if(income<2.5){
                        System.out.println("NO TAX");

        }
       else if(income>=2.5&& income<5.0){
            System.out.println("5% TAX");}
        else if(income>=5.0 && income<10.0){
                     System.out.println("20% TAX");}
        else   {
                        System.out.println("30% TAX");

                  sc.close();      
 
        }


        }           

        }
        


    
    

