 class Square{
     int side;
     int area;
     int perimeter;
    public int SideOfSqaure(){
        return side;
    }
   public int AreaOfSqaure(){
   area= side*side;
    return area;
   }
   public int perimeterOfSquare(){
    perimeter=4*side;
    return perimeter;
   }
 }
    

public class OopsExcersice {
    public static void main(String[]args){

   Square sq= new Square();
   sq.side=5;

   System.out.println(sq.perimeterOfSquare());
   System.out.println(sq.AreaOfSqaure());

}

}

