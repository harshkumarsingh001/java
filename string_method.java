public class string_method {
    public static void main(String[]args){

     String word="Harsh";
     String tolower=word.toLowerCase();
     String toupper=word.toUpperCase();
       System.out.println(tolower);
      System.out.println(toupper);
    

       String nam="         jai shree ram           ";
        System.out.println(nam);
        String name=nam.trim();
        System.out.println(name);


        String substring=word.substring(2);
        System.out.println(substring);
             String subst_ring=word.substring(1,4);
             System.out.println(subst_ring);

             System.out.println(word.replace('r','t'));

            
             String words="rajput";
             System.out.println(words.startsWith("raj"));
             System.out.println(words.endsWith("raj"));


             System.out.println(words.charAt(3));

             System.out.println(words.indexOf("j"));

             
             
             String wor="dkgksfgffeg";
             System.out.println(wor.indexOf("f",6));

             System.out.println(word.equals("harsh"));

              System.out.println(word.equalsIgnoreCase("harSh"));



    
    
    
    
    
    
    
    
    
    
    
    }
    
}
