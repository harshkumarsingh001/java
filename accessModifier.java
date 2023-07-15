class modifier{
    private String password;
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
         this.password=password;
    }
}




public class accessModifier {
    public static void main(String[]args){
        modifier prv=new modifier();
        prv.setPassword("abcde");
        System.out.println(prv.getPassword());
    }
   
    }
    

