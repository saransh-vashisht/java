
// Java Continue statement 
// it will break out of the loop iteration immediately and then will follow the next iteration

// jump-statement;
// continue;


public class JavaLoops_18 {
    public static void main(String[] args) {
        // For loop
        for (int  i = 1; i <= 10; i++) {
            if (i==5) {
                // using continue statement
                continue;//it will skip the rest statement
            }
            System.out.println(i);
            
        }
    }
}
