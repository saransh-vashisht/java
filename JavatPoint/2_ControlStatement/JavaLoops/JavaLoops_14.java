// Java break statement with inner loop


// Java Program to illustrate the use of break statement
// inside an inner loop 


public class JavaLoops_14 {
    public static void main(String[] args) {
        // outer loop
        for (int i = 1; i <= 3; i++) {
            // inner loop
            for (int j = 1; j <= 3; j++) {
                if (i==2&&j==2) {
                    break;
                    // using break statement inside the inner loop
                }
                System.out.println(i+" "+j);
                
            }
        }
    }
}
