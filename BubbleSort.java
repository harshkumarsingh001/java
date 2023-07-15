import java.util.Scanner;
public class BubbleSort {
    public static void main(String[]args){
    
        System.out.print("enteer the size of array:-");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]marks=new int[size];
        System.out.println("enter the marks:-");
       for(int i=0;i<size;i++){
          marks[i]=sc.nextInt();
       }

        for(int i=0;i<marks.length-1;i++){
            for(int j=0;j<marks.length-i-1;j++){
                if(marks[j]>marks[j+1]){
                    int temp=marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]=temp;
                }
            }
        }
        System.out.print("sorted number=");

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        sc.close();
    }
    
}
