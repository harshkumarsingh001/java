class shape{
    int area;
    double circum;
    public void printArea(){
        System.out.println("area of shape is:-"+area);
    }
    public void printCircum(){
           System.out.println("area of shape is:-"+circum);
    }
}
class tringle extends shape{
    int b;
    int h;
    public int calcarea(){
      area=(b*h)/2;
        return area;
    }
}
class circle extends shape{
    double radi;
    public double itsArea(){
        circum=2*3.14*radi;
        return circum;
    }
}

public class Ineritance {
    public static void main(String[]args){
        tringle a=new tringle();

        circle c=new circle();
        a.b=6;
        a.h=3;
        c.radi=7;
        a.calcarea();
        a.printArea();
        c.itsArea();
        c.printCircum();
    }
}