
//find and int present in array or not

import java.util.Scanner;
public class array_problem {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int[size];

        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        int x=sc.nextInt();

         for(int i=0;i<size;i++){
            if(number[i]==x){
             System.out.println("number found on "+i+"index");   
            }
            sc.close();
            
    }}}