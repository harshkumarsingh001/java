 

import java.util.Scanner;
public class transposed_matrix {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //int[][]number=new int[rows][columns]
        int rows=sc.nextInt();
        int columns=sc.nextInt();
          int[][]number=new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                number[i][j]=sc.nextInt();

            }
        }
       for(int j=0;j<columns;j++){
         for(int i=0;i<rows;i++){
            System.out.print(number[i][j]+" ");
         }
         System.out.println();
       }
    sc.close();
  }
}