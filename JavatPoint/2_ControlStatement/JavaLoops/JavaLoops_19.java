
// Java Program to illustrate the use of continue statement
// inside an inner loop


public class JavaLoops_19 {
    public static void main(String[] args) {
        // outer loop
        for (int i = 1; i <=3; i++) {
            //inner loop
            for (int j = 0; j <= 3; j++) {
                if (i==2&&j==2) {
                    // Using continue statement inside inner loop
                    continue;
                }
                System.out.println(i+" "+j);
                
            }
            
        }
    }
}
