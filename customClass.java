 class Employee{
    int id;
    String name;
    int salary;
    public  void printDetails(){
            System.out.println("my id is :- "+id);
            System.out.println("my name is :- "+name);
        }
    public int getSalary(){
        return salary;
        }
        
}



public class customClass {
    public static void main(String[]args){
        Employee harsh=new Employee();     //Instantiating a new Employee object
        Employee yash=new Employee();



    //Setting Attributes for harsh
        harsh.id=12;
        harsh.name="harsh rajput";
        harsh.salary=12000;
         //Setting Attributes for yash 
        yash.id=14;
        yash.name="yash rajput";

        harsh.printDetails();
        yash.printDetails();
    int salary=harsh.getSalary();
    System.out.println(salary);

    }
    
}
