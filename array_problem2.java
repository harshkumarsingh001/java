public class array_problem2 {
    public static void main(String[]args){
        float[]price={98.5f,93.9f,89.9f,78.87f,75.98f};
        float sum=0.0f;
       
        for(int i=0;i<price.length;i++){
            sum+= price[i];}
            System.out.println("sum of price:-"+sum);
        

    }
    
}