//Take an array of names as input from the user and print them on the screen.

import java.util.Scanner;
public class problem_array2{
    public static void main(String[]args){
   
   
        Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();
    int column=sc.nextInt();


    int [] []number=new int[rows][column];


    for(int i=0;i<rows;i++){
        for(int j=0;j<column;j++){
           number[i][j]=sc.nextInt();
        }
    }

int x=sc.nextInt();

for(int i=0;i<rows;i++){
        for(int j=0;j<column;j++){
          if(number[i][j]==x){
            System.out.println("x found at the location of ("+i+","+j+")");
          }
        }
       
    }
   sc.close();
   
    }}

