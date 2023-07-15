public class recursion2 {
    public static int oddNumberSum(int i,int n,int sum){
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return 0;
        }
      sum=sum+i;
     
      oddNumberSum(i+1,n,sum);
      
      return sum;  

    }
   public static void main(String[]args) {
    
    oddNumberSum(1,5,0);
   }
}
