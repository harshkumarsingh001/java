public class array_basic {
    public static void main(String[]args){
        int[]marks={34,56,76,54,76,94};
      //  marks=new int[4];
        //marks[0]=93;
       // marks[1]=98;
        //marks[2]=95;
        //marks[3]=92;
        System.out.println("length of array:-");
        System.out.println(marks.length);
        //System.out.println(marks[3]);
        System.out.println("reverse order");
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
        System.out.println("for-each loop");
        for(int element:marks){
            System.out.println(element);
        }



    }
}
