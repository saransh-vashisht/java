
// Java Continue Statement


public class Statement_17 {
    public static void main(String[] args) {
      for(int i=0;i<=2;i++){
        for(int j=i;j<=5;j++){
            if (j==4) {
                continue;
                // here the loop will skip the iteration of 4 and move to the next iteration to be executed
                
            }
            System.out.println(j);

        }
      }  
    }
}
