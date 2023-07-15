class Employee{
   private int id;
    private String name;

    public Employee(){
        id=456;
        name="yash rajput";
    }



    public int getId(){
        return id;
    }
    public void setId(int i){
        id=i;
    }
   public String getName(){
    return name;
   }
   public void setName(String n){
    name=n;
   }
}



public class getSet {
    public static void main(String[]main){


    Employee harsh=new Employee();

   // harsh.setId(738);
    System.out.println(harsh.getId());

    //harsh.setName("harsh kumar singh");
    System.out.println(harsh.getName());
    }
    
}
